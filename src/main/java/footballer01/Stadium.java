package footballer01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Stadium {

    public static final int BASESALARY = 100_000;
    public static final int BASETRAINIGHOURS = 50;
    public static final int GOALMIN = 5;

    private List<Footballer> footballers;

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
}
