package dungeon;

public class Coordinates {

    private int x; //horizontal coordinate
    private int y; //vertical coordinate
    private Direction direction;

    public Coordinates() {
    }

    public Direction getDirection() {
        return direction;
    }

    //constructor for Vampire class
    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
        direction = new Direction();
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //changes coordinates according to movement direction, taking into account map boarders.
    public void move(Direction direction) {
        setX(direction.getNewX());
        setY(direction.getNewY());
    }




    public String coordinatesToString() {
        return getX() + "," + getY();
    }
}
