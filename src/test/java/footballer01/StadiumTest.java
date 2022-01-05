package footballer01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StadiumTest {

    Stadium stadium;
    List<String> readFile;
    Path path;

    @BeforeEach
    void init() {
        stadium = new Stadium();
        readFile = new ArrayList<>();
        path = Path.of("src/test/resources/focistak.txt");
        stadium.makeFootballer(path);
        stadium.training();
        stadium.makeSalary();
        stadium.goalShoot();
        stadium.matchNumbers();
    }

    @Test
    void testReadFile() {
        List<String> expected = stadium.readFile(path);
        assertEquals(10, expected.size());
    }

    @Test
    void testMakeFootballer() {
        assertEquals(10, stadium.getFootballers().size());
    }

    @Test
    void testTraining() {
        assertNotNull(stadium.getFootballers().get(0).getTrainingHours());
        assertNotNull(stadium.getFootballers().get(9).getTrainingHours());
    }

    @Test
    void testMakeSalary() {
        assertNotNull(stadium.getFootballers().get(0).getSalary());
        assertNotNull(stadium.getFootballers().get(9).getSalary());

        System.out.println();
    }

    @Test
    void testPrintDatas() {

        stadium.printDatas();
    }

}