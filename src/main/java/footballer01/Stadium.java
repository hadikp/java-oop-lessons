package footballer01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stadium {

    public static final int BASESALARY = 100_000;
    public static final int BASETRAINIGHOURS = 50;
    public static final int TRAINIGHOURPLUSSALARY = 2000;
    public static final int GOALMIN = 5;
    private Random rnd = new Random();

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

    public void training() {
        for (Footballer f: footballers) {
            int trainingHours = rnd.nextInt(100) + 51;
            f.setTrainingHours(trainingHours);
        }
    }

    public void goalShoot() {
        for (Footballer f: footballers) {
            int goalNumbers = rnd.nextInt(10);
            f.setGoalNumbers(goalNumbers);
        }
    }

    public void matchNumbers() {
        for (Footballer f: footballers) {
            int matchNumbers = rnd.nextInt(10) + 1;
            f.setMatchNumbers(matchNumbers);
        }
    }

    public void makeSalary() {
        int salary = BASESALARY;
        for (Footballer f: footballers) {
            if (f.getTrainingHours() > BASETRAINIGHOURS) {
                salary += (f.getTrainingHours() - 50) * TRAINIGHOURPLUSSALARY;
                f.setSalary(salary);
                salary = BASESALARY;
            }
        }
    }

    public void printDatas() {
        for (Footballer f: footballers) {
            System.out.println(f);
        }
    }
}
