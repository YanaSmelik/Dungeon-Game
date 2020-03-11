package dungeon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TestPlayer {


    // *********** move() *********** //
    // Out of bounds (upper, bottom, left, right)

    @Test
    void playerMoveOutOfUpperBound() {
        Player player = new Player();
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        player.move('w');

        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    void playerMoveOutOfBottomBound() {
        Player player = new Player();
        Dungeon dungeon = new Dungeon(5, 1, 5, 5, true);

        player.move('s');
        player.move('s');

        assertEquals(0, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    void playerMoveOutOfLeftBound() {
        Player player = new Player();
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        player.move('a');

        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    void playerMoveOutOfRightBound() {
        Player player = new Player();
        Dungeon dungeon = new Dungeon(1, 5, 5, 5, true);
        player.move('d');
        player.move('d');

        assertEquals(1, player.getX());
        assertEquals(0, player.getY());
    }



    // *********** move() *********** //
    // moves (s, w, a, d) inside the Map. 'happy paths'
    @Test
    void playerMoveSIsideMap() {
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        Player player = new Player();
        player.move('s');

        assertEquals(0, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    void playerMoveWInsideMap() {
        Player player = new Player();
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        player.move('s');
        player.move('s');
        player.move('w');


        assertEquals(0, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    void playerMoveAInsideMap() {
        Player player = new Player();
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        player.move('d');
        player.move('d');
        player.move('a');

        assertEquals(1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    void playerMoveDInsideMap() {
        Player player = new Player();
        Dungeon dungeon = new Dungeon(5, 5, 5, 5, true);
        player.move('d');

        assertEquals(1, player.getX());
        assertEquals(0, player.getY());
    }


    //TODO write tests for invalid input (throw exception)


    @Test
    void coordinatesToString() {
        Player player = new Player();
        assertEquals("P: 0,0", player.coordinatesToString());
    }
}

