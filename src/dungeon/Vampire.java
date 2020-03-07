package dungeon;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Vampire implements Moves{


    /*
     - the vampires move randomly in the game
    - vampires take one step for each step the player takes
    - if player and vampire run into each other  - the vampire is destroyed.
            - if vampire tries to step outside the board, or into a place already occupied by another vampire, the move is not executed
    - when all the vampires are destroyed, the game ends and it prints YOU WON.
     */


    private int x;
    private int y;


    public Vampire(){
        x = randomCoordinate(10); //set random number for the initial position. method parameter - field width;
        y = randomCoordinate(5); //set random number for the initial position. method parameter - field height;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    private int randomCoordinate(int bound){
        //TODO figure out how to get size of the field.
        return ThreadLocalRandom.current().nextInt(bound);
    }


    public char randomMove(){
        char[] possibleMoves = {'w', 's', 'd', 'a'};
        return possibleMoves[ThreadLocalRandom.current().nextInt(4)];
    }

    @Override
    public void move(char key) {
        switch (key){
            case 'w':
                y--;
                break;
            case 'd':
                x++;
                break;
            case 's':
                y++;
                break;
            case 'a':
                x--;
                break;
            //TODO handle invalid input
        }
    }


    public String coordinatesToString(){
        return "V: " + getY() + ", " + getX();
    }
}
