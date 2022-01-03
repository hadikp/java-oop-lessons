package animal01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CompetitionTest {

    Competition competition;
    Path path;

    @BeforeEach
    void init() {
        path = Path.of("src/test/resources/animal01.txt");
        competition = new Competition();
        competition.makeAnimalsList(path);
    }

    @Test
    void testMakeAnimalsList() {
        assertEquals(5, competition.getAnimals().size());
    }

    @Test
    void testWinner() {
        System.out.println(competition.getAnimals());
        System.out.println(competition.winner());

    }

}