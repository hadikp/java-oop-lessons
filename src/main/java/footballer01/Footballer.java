package footballer01;

public class Footballer {

    private String name;
    private String certificateNumber;
    private int trainingHours;
    private int matchNumbers;
    private int goalNumbers;
    private int salary;
    public static final String BLUE = "\033[0;34m";
    public static final String WHITE_BRIGHT = "\033[0;97m";

    public Footballer(String name, String certificateNumber) {
        this.name = name;
        this.certificateNumber = certificateNumber;
    }

    public String getName() {
        return name;
    }

    public int getTrainingHours() {
        return trainingHours;
    }

    public int getMatchNumbers() {
        return matchNumbers;
    }

    public int getGoalNumbers() {
        return goalNumbers;
    }

    public int getSalary() {
        return salary;
    }

    public void setTrainingHours(int trainingHours) {
        this.trainingHours = trainingHours;
    }

    public void setMatchNumbers(int matchNumbers) {
        this.matchNumbers = matchNumbers;
    }

    public void setGoalNumbers(int goalNumbers) {
        this.goalNumbers = goalNumbers;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name +  BLUE + ", training: " + trainingHours + " hour" + WHITE_BRIGHT+
                ", matchNumbers: " + matchNumbers + BLUE +
                ", goalNumbers: " + goalNumbers + WHITE_BRIGHT +
                ", salary: " + salary + " Ft";
    }
}
