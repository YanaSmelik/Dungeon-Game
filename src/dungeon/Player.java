package dungeon;

public class Player {

    private Coordintes coordinates;

    public Player (){
        coordinates = new Coordintes(0, 0); //set initial coordinates to the top left corner;
    }




    public String coordinatesToString(){
        return "P " + coordinates.getX() + " " + coordinates.getY();
    }

}
