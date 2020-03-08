package dungeon;


import java.util.concurrent.ThreadLocalRandom;

public class Vampire extends Coordinates {

    private Coordinates coordinates;
    /*
     - the vampires move randomly in the game
    - vampires take one step for each step the player takes
    - if player and vampire run into each other  - the vampire is destroyed.
            - if vampire tries to step outside the board, or into a place already occupied by another vampire, the move is not executed
    - when all the vampires are destroyed, the game ends and it prints YOU WON.
     */

    public Vampire() {
        super();
        coordinates = new Coordinates();
        coordinates.setX(randomCoordinate(10)); //set random number for the initial position. method parameter - field width;
        coordinates.setY(randomCoordinate(5));  //set random number for the initial position. method parameter - field height;

    }


    public int randomCoordinate(int bound) {
        //TODO figure out how to get size of the field.
        return ThreadLocalRandom.current().nextInt(bound);
    }


    public void move() {
        char key = randomMove();
        super.move(key);
    }


    //random move for move() method
    private char randomMove() {
        char[] possibleMoves = {'w', 's', 'd', 'a'};
        return possibleMoves[ThreadLocalRandom.current().nextInt(4)];
    }


    public String coordinatesToString() {
        return "V: " + super.coordinatesToString();
    }
}
