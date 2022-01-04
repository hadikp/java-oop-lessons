package animal01;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return points == animal.points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return name + ": " +  points + " pont";
    }
}
