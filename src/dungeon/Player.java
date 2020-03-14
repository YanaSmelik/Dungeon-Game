package dungeon;

public class Player {

    private int x;
    private int y;
    private int predictedX; //is used for predicting moves
    private int predictedY; //is used for predicting moves


    // At the start a player is placed on 0,0
    public Player() {
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


    //player moves (considering boundaries)
    public void move(char direction) {
        predictMoveInDirection(direction);
        if (isInBounds()) {
            setX(predictedX);
            setY(predictedY);
        }
    }



    //predicts player's position regarding movement direction
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

    //verifies whether the move is valid taking into account field (map) boundaries
    private boolean isInBounds() {
        if (predictedX <= Dungeon.getLength() && predictedX >= 0 && predictedY <= Dungeon.getHeight() && predictedY >= 0) {
            return true;
        }
        return false;
    }


    public String coordinatesToString() {

        return "P: " + getX() + ", " + getY();
    }
}
