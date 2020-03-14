package dungeon;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Vampire {

    private int x;
    private int y;
    private int predictedX;
    private int predictedY;
    /*
     - the vampires move randomly in the game
    - vampires take one step for each step the player takes
    - if player and vampire run into each other  - the vampire is destroyed.
            - if vampire tries to step outside the board, or into a place already occupied by another vampire, the move is not executed
    - when all the vampires are destroyed, the game ends and it prints YOU WON.
     */

    public Vampire() {
        x = ThreadLocalRandom.current().nextInt(Dungeon.getLength()); //sets vampires randomly on a map
        y = ThreadLocalRandom.current().nextInt(Dungeon.getHeight());
        predictedX = x;
        predictedY = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    //moves vampire taking into consideration map boundaries and free spots (placements of other vampires)
    public void move(List<Vampire> vampires) {
        predictMoveInDirection(randomMoveDirection());
        if(isInBounds() && isFreeSpot(vampires)){
            setX(predictedX);
            setY(predictedY);
        }
    }


    //random move for move() method
    private char randomMoveDirection() {
        char[] possibleMoves = {'w', 's', 'd', 'a'};
        return possibleMoves[ThreadLocalRandom.current().nextInt(4)];
    }


    //predict vampires move in the direction
    public void predictMoveInDirection(char direction) {
        predictedX = getX();
        predictedY = getY();
        switch (direction) {
            case 'a':
                predictedX--;
                break;
            case 'd':
                predictedX++;
                break;
            case 's':
                predictedY++;
                break;
            case 'w':
                predictedY--;
                break;
        }
    }


    //verifies move validity considering field size
    private boolean isInBounds() {
        if(predictedX <= Dungeon.getLength() && predictedX >= 0 && predictedY <= Dungeon.getHeight() && predictedY >=0){
            return true;
        }
        return false;
    }


    //verified that if vampire moves, he won't take other vampire's place
    public boolean isFreeSpot(List<Vampire> vampireSquad){
        for (Vampire vampire : vampireSquad) {
            if (predictedX == vampire.getX() && predictedY == vampire.getY()) {
                return false;
            }
        }
        return true;
    }




    public String coordinatesToString() {
        return "V: " + getX() + ", " + getY();
    }

}
