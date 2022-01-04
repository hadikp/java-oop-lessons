package footballer01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Stadium {

    public static final int BASESALARY = 100_000;
    public static final int BASETRAINIGHOURS = 50;
    public static final int GOALMIN = 5;

    private List<Footballer> footballers = new ArrayList<>();

    public List<Footballer> getFootballers() {
        return footballers;
    }

    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Can't read file!", ioe);
        }
    }

    public void makeFootballer(Path path) {
        List<String> fileRead = readFile(path);
        for (String st: fileRead) {
            String[] stSplit = st.split(";");
            footballers.add(new Footballer(stSplit[0], stSplit[1]));
        }
    }
}
