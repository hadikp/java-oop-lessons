package animal01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal parduc = new Animal("Párduc", 2019, 10);
        System.out.println(parduc);
    }

}