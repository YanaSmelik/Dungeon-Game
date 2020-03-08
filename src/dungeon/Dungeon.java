package dungeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dungeon {

    private int length;
    private int height;
    private int moves;
    private int vampires;
    private boolean vampiresMove;
    private Player player;
    private Scanner reader;
    private Vampire vampire; //temporary it's only one Vampire


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMoves) {

        // TODO change count length and height from 1 (not from 0);

        this.length = length;  // length and height - represent the dimension of the dungeon (always a rectangle);
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;  // moves - determines the initial number of moves
        this.vampiresMove = vampiresMoves; //if vampiresMoves is false --> the vampires do not move
        this.player = new Player();
        this.reader = new Scanner(System.in); //create one scanner object that will be used multiple times throughout the program
        vampire = new Vampire();
    }


    //starts the game
    public void run() {
        while (moves >= 0) {
            System.out.println(player.coordinatesToString()); //print P coordinates;
            System.out.println(vampire.coordinatesToString());//print V coordinates;
            printCurrentFieldSituation();                       //print field
            System.out.println("Moves left: " + moves);  //how many moves left

            System.out.print("Your move(s): ");             //ask user for input (command(s))
            String command = reader.nextLine();
            movePlayerAccordingToCommand(command);          // move P and V


            moves--;
        }


    }

    public void movePlayerAccordingToCommand(String command) {
        char[] moves = new char[command.length()];  //create empty array with size of the command
        moves = command.toCharArray(); //convert user's command(s) to array of chars (keys);
        for (int i = 0; i < moves.length; i++) { // change Player's coordinates accordingly
            player.move(moves[i]);
            vampire.move();
        }
    }


    public void printCurrentFieldSituation() {   //prints player's position on the field
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= length; j++) {
                if (i == player.getY() && j == player.getX()) {
                    System.out.print("P");
                } else if (i == vampire.getY() && j == vampire.getX()) {
                    System.out.print("V");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}


