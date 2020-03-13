package dungeon;

import java.util.concurrent.ThreadLocalRandom;

public class Direction extends Coordinates {

    private int newX;
    private int newY;
    private char dir;

    public Direction() {
        super();
    }

    public Direction(int newX, int newY) {
        super();
        this.newX = newX;
        this.newY = newY;
    }

    public Direction(char dir){
        this.dir = dir;
    }


    public int getNewX() {
        return newX;
    }

    public int getNewY() {
        return newY;
    }

    public char getDir() {
        return dir;
    }

    public Direction randomDirection(){
        char [] moveDirections = {'s', 'd', 'a', 'w'};
        return moveInDirection(moveDirections[ThreadLocalRandom.current().nextInt(4)]);
    }


    public Direction moveInDirection(char key) {
        switch (key) {
            case 'a':
                return new Direction(getX() - 1, getY());
            case 'd':
                return new Direction(getX() + 1, getY());
            case 's':
                return new Direction(getX(), getY() + 1);
            case 'w':
                return new Direction(getX(), getY() - 1);
            default:
                return null;
        }
    }
}
