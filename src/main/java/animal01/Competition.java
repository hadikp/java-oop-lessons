package animal01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Competition {

    private Set<Animal> animals = new HashSet<>();

    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Can't read file!", ioe);
        }
    }

    public void makeAnimalsList(Path path) {
        List<String> animalList = readFile(path);
        Random rnd = new Random();
        for (String st: animalList) {
            int points = rnd.nextInt(10) + 1;
            String[] stSplit = st.split(",");
            int yearOfBirth = Integer.parseInt(stSplit[1].trim());
            animals.add(new Animal(stSplit[0], yearOfBirth, points));
        }
    }

    public String winner() {
        int max = 0;
        String  winner = animals.toString();
        for (Animal a: animals) {
            if (a.getPoints() > max) {
                max = a.getPoints();
                winner = a.getName();
            }
        }
        return winner;
    }

    public void printSequence() {
        for (Animal a: animals) {
            System.out.println(a);
        }
    }

    public Set<Animal> getAnimals() {
        return animals;
    }
}
