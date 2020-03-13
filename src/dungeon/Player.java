package dungeon;

public class Player extends Coordinates {


    public Player() {
        super();
    }


    @Override
    public void move(Direction direction) {
        super.move(direction.moveInDirection(direction.getDir()));
    }

    @Override
    public String coordinatesToString() {

        return "P: " + super.coordinatesToString();
    }


}
