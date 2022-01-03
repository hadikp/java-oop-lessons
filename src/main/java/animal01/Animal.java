package animal01;

public class Animal {

    private final String name;
    private final int yearOfBirth;
    private int points;

    public Animal(String name, int yearOfBirth, int points) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return name + ": " +  points + " pont";
    }
}
