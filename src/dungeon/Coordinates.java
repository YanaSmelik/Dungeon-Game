package dungeon;

public class Coordinates {

    private int x; //horizontal coordinate
    private int y; //vertical coordinate

    public Coordinates() {
    }


    //constructor for Vampire class
    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    //changes coordinates according to movement direction, taking into account map boarders.
    public void move(char key) {
        switch (key) {
            case 'w':
                if (y > 0) {
                    y--;
                }
                break;
            case 'd':
                if(x < Dungeon.getLength()){
                    x++;
                }
                break;
            case 's':
                if(y < Dungeon.getHeight()){
                    y++;
                }
                break;
            case 'a':
                if(x > 0){
                    x--;
                }
                break;
            //TODO handle invalid input
        }
    }




    public String coordinatesToString() {
        return getX() + "," + getY();
    }
}
