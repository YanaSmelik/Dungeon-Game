package dungeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon {

    public static int length;
    public static int height;
    private int moves;
    private boolean vampiresMove;
    private Player player;
    private Scanner reader;
    private ArrayList<Vampire> vampiresSquad;


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMoves) {

        // TODO change count length and height from 1 (not from 0);

        this.length = length;  // length and height - represent the dimension of the dungeon (always a rectangle);
        this.height = height;
        this.moves = moves;  // moves - determines the initial number of moves
        this.vampiresMove = vampiresMoves; //if vampiresMoves is false --> the vampires do not move
        this.player = new Player();
        this.reader = new Scanner(System.in); //create one scanner object that will be used multiple times throughout the program
        vampiresSquad = new ArrayList<>(vampires);
        for (int i = 0; i < vampires; i++) {     //add 5 vampires to the vampiresSquad
            vampiresSquad.add(new Vampire());
        }
    }


    //starts the game
    public void run() {
        while (moves >= 0) {
            printPlayersCoordinates(); //print P coordinates;
            printVampiresCoordinates();//print V coordinates;
            printCurrentMap();                       //print field
            System.out.println("Moves left: " + moves);  //how many moves left

            System.out.print("Your move(s): ");             //ask user for input (command(s))
            String command = reader.nextLine();
            movePlayerAccordingToCommand(command);          // move P and V


            moves--;
        }
    }


    public void movePlayerAccordingToCommand(String command) {
        char[] moves = command.toCharArray(); //convert user's command(s) to array of chars (keys);
        for (int i = 0; i < moves.length; i++) { // change Player's coordinates accordingly
            player.move(moves[i]);
            moveSquad(vampiresSquad); //move vampires
        }
    }

    public static int getLength() {
        return length;
    }

    public static int getHeight() {
        return height;
    }

    public void moveSquad(ArrayList<Vampire> squad) {  //move each Vampire in random way
        for (Vampire vampire : squad) {
            vampire.move();
        }
    }


    public void printVampiresCoordinates() {    //prints coordinates of all vampires
        for (Vampire vampire : vampiresSquad) {
            System.out.println(vampire.coordinatesToString());
        }
    }


    public void printPlayersCoordinates() {
        System.out.println(player.coordinatesToString());
    }


    public void printCurrentMap() {   //prints player's position on the field
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= length; j++) {
                if (i == player.getY() && j == player.getX()) {
                    System.out.print("P");
                } else if (doCoordinatesMatch(j, i)) {
                    System.out.print("V");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }


    public boolean doCoordinatesMatch(int x, int y) {
        for (Vampire vampire : vampiresSquad) {
            if (vampire.getX() == x && vampire.getY() == y) {
                return true;
            }
        }
        return false;
    }
}


