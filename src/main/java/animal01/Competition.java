package animal01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition {

    private List<Animal> animals = new ArrayList<>();

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
        String  winner = animals.get(0).toString();
        for (Animal a: animals) {
            if (a.getPoints() > max) {
                max = a.getPoints();
                winner = a.getName();
            }
        }
        return winner;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
