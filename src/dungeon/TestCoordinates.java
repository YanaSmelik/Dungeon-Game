package dungeon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoordinates {


    // *********** move() *********** //
    // Out of bounds (upper, bottom, left, right)
    @Test
    void moveOutOfUpperBound() {
        Coordinates coordinates = new Coordinates();
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('w');

        assertEquals(0, coordinates.getX());
        assertEquals(0, coordinates.getY());
    }

    @Test
    void moveOutOfBottomBound() {
        Coordinates coordinates = new Coordinates(5,5);
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('s');


        assertEquals(5, coordinates.getX());
        assertEquals(5, coordinates.getY());
    }

    @Test
    void moveOutOfLeftBound() {
        Coordinates coordinates = new Coordinates();
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('a');

        assertEquals(0, coordinates.getX());
        assertEquals(0, coordinates.getY());
    }

    @Test
    void moveOutOfRightBound() {
        Coordinates coordinates = new Coordinates(5,5);
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('d');

        assertEquals(5, coordinates.getX());
        assertEquals(5, coordinates.getY());
    }


    // *********** move() *********** //
    // moves (s, w, a, d) from the middle of the map

    @Test
    void moveSFromMiddleOfMap() {
        Coordinates coordinates = new Coordinates(2,3);
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('s');

        assertEquals(2, coordinates.getX());
        assertEquals(4, coordinates.getY());
    }

    @Test
    void moveWFromMiddleOfMap() {
        Coordinates coordinates = new Coordinates(2,3);
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('w');


        assertEquals(2, coordinates.getX());
        assertEquals(2, coordinates.getY());
    }

    @Test
    void moveAFromMiddleOfMap() {
        Coordinates coordinates = new Coordinates(2,3);
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('a');

        assertEquals(1, coordinates.getX());
        assertEquals(3, coordinates.getY());
    }

    @Test
    void moveDFromMiddleOfMap() {
        Coordinates coordinates = new Coordinates(2,3);
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        coordinates.move('d');

        assertEquals(3, coordinates.getX());
        assertEquals(3, coordinates.getY());
    }



    @Test
    void coordinatesToString() {
        Coordinates coordinates = new Coordinates();
        assertEquals("0,0", coordinates.coordinatesToString());
    }



    //TODO write tests for invalid input (throw exceptions)


}
