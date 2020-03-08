package dungeon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoordinates {


    @Test
    void moveS() {
        Coordinates coordinates = new Coordinates();
        coordinates.move('s');

        assertEquals(0, coordinates.getX());
        assertEquals(1, coordinates.getY());
    }

    @Test
    void moveW() {
        Coordinates coordinates = new Coordinates();
        coordinates.move('w');

        assertEquals(0, coordinates.getX());
        assertEquals(-1, coordinates.getY());
    }

    @Test
    void moveA() {
        Coordinates coordinates = new Coordinates();
        coordinates.move('a');

        assertEquals(-1, coordinates.getX());
        assertEquals(0, coordinates.getY());
    }

    @Test
    void moveD() {
        Coordinates coordinates = new Coordinates();
        coordinates.move('d');

        assertEquals(1, coordinates.getX());
        assertEquals(0, coordinates.getY());
    }


    @Test
    void coordinatesToString() {
        Coordinates coordinates = new Coordinates();
        assertEquals("0,0", coordinates.coordinatesToString());
    }
}
