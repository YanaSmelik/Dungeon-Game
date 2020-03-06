import dungeon.Dungeon;

public class Main {
    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon(10, 5, 5, 4, true);
        dungeon.run();
    }




    /*
    create only one Scanner object
    do not use static variables
     */


    //GAME:
    /*
    - The player is in a dungeon full of vampires.
    - The player has to destroy the vampires before his lamp runs out of battery
    - The player can see the vampires with a blinking of their lump. after which they have to move blind before the
      following blinking.
    - With one move, the player can walk as many steps he wants.
     */

    /*
    - The dungeons, the player and the vampires are shown in text form. (Player - P, Vampires - V, Dungon - -)
    - The first line in the printout tells how many moves the player has left (how much battery the lamp has)
    - After that the print output shows player and vampire positions, which are followed by the game map.
     */

    /*
    - The user can move by giving a sequence of commands and pressing Enter.
    - The commands are:
        - w - go up
        - s - go down
        - a - go left
        - d - go right
     */

    /*
    - user can give many commands at once
    - when the user's commands are executed - a new game situation is drawn
    - if the lamp charge is 0, the game ends and the test YOU LOSE is printed on the board.
     */

    /*
    - the vampires move randomly in the game
    - vampires take one step for each step the player takes
    - if player and vampire run into each other  - the vampire is destroyed.
    - if vampire tries to step outside the board, or into a place already occupied by another vampire, the move is not executed
    - when all the vampires are destroyed, the game ends and it prints YOU WON.
     */

    /*
    - the player starts the game in position 0,0;
    - player and vampires can not move out of the dungeon
    - two vampires cannot step into the same place
    -
     */
}
