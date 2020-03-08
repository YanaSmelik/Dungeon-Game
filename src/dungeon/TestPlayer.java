package dungeon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TestPlayer {


    @Test
    void moveS() {
        Player player = new Player();
        player.move('s');

        assertEquals(0, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    void moveW() {
        Player player = new Player();
        player.move('w');

        assertEquals(0, player.getX());
        assertEquals(-1, player.getY());
    }

    @Test
    void moveA() {
        Player player = new Player();
        player.move('a');

        assertEquals(-1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    void moveD() {
        Player player = new Player();
        player.move('d');

        assertEquals(1, player.getX());
        assertEquals(0, player.getY());
    }


    //TODO write tests for invalid moves (negative numbers, exceed borders, letters, special chars, floats)
    //TODO modify tests, considering field boundaries.


    @Test
    void coordinatesToString() {
        Player player = new Player();
        assertEquals("P: 0,0", player.coordinatesToString());
    }
}

