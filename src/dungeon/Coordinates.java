package dungeon;

public class Coordinates {

    private int x; //horizontal coordinate
    private int y; //vertical coordinate

    public Coordinates() {
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
        return getX() + "," + getY();
    }
}
