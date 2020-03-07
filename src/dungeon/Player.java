package dungeon;

public class Player implements Moves {

    private int x;
    private int y;

    public Player() {
        this.x = 0; //horizontal coordinate
        this.y = 0; //vertical coordinate
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public void move(char key) {
        switch (key) {
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

    public String coordinatesToString() {
        return "P: " + getY() + "," + getX();
    }


}
