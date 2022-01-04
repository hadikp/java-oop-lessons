package footballer01;

public class Footballer {

    private String name;
    private String certificateNumber;
    private int trainingHours;
    private int matchNumbers;
    private int goalNumbers;

    public Footballer(String name, String certificateNumber) {
        this.name = name;
        this.certificateNumber = certificateNumber;
    }

    public void training(int hours) {
        trainingHours += hours;
    }
}
