package dungeon;

public class Player extends Coordinates {


    public Player() {
        super();
    }


    @Override
    public void move(char key) {
        super.move(key);
    }

    @Override
    public String coordinatesToString() {

        return "P: " + super.coordinatesToString();
    }


}
