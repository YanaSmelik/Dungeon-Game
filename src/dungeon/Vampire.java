package dungeon;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Vampire extends Coordinates{

    private Coordinates coordinates;
    /*
     - the vampires move randomly in the game
    - vampires take one step for each step the player takes
    - if player and vampire run into each other  - the vampire is destroyed.
            - if vampire tries to step outside the board, or into a place already occupied by another vampire, the move is not executed
    - when all the vampires are destroyed, the game ends and it prints YOU WON.
     */

    public Vampire() {
        //set x and y as random numbers (considering height and length).
        super(ThreadLocalRandom.current().nextInt(Dungeon.getLength()),
                ThreadLocalRandom.current().nextInt(Dungeon.getHeight()));
    }


    public void move() {
        super.move(getDirection());
    }


    //random move for move() method
    private char randomMoveDirection() {
        char[] possibleMoves = {'w', 's', 'd', 'a'};
        return possibleMoves[ThreadLocalRandom.current().nextInt(4)];
    }


    public boolean isValidMove(Direction direction, ArrayList<Vampire> vampireSquad) {
        for (Vampire vampire : vampireSquad) {
            if (direction.getNewX() == vampire.getX() && direction.getNewY() == vampire.getY()) {
                return false;
            }
        }
        return true;
    }

    public String coordinatesToString() {
        return "V: " + super.coordinatesToString();
    }

}
