package dungeon;

import java.util.Scanner;

public class Dungeon {

    private int length;
    private int height;
    private int moves;
    private int vampires;
    private boolean vampiresMove;
    private Player player;
    private Scanner reader;


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMoves) {

        // TODO change count length and height from 1 (not from 0);

        this.length = length;  // length and height - represent the dimension of the dungeon (always a rectangle);
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;  // moves - determines the initial number of moves
        this.vampiresMove = vampiresMoves; //if vampiresMoves is false --> the vampires do not move
        this.player = new Player();
        this.reader = new Scanner(System.in); //create one scanner object that will be used multiple times throughout the program
    }


    //starts the game
    public void run() {
        System.out.println("Moves left: " + moves);
        System.out.println(player.coordinatesToString());
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

    }


    //temporary method. To check the move()
    public void testMove(){
        System.out.println(player.coordinatesToString());
        player.move('s');
        System.out.println(player.coordinatesToString());
    }


    public void printCurrentFieldSituation(){   //prints player's position on the field
        System.out.println("Moves left: " + moves);
        System.out.println(player.coordinatesToString());
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= length; j++) {
                if(i == player.getY() && j == player.getX()){
                    System.out.print("P");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}


