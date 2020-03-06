package dungeon;

public class Dungeon {

    private int length;
    private int height;
    private int moves;
    private int vampires;
    private boolean vampiresMove;
    private Player player;


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMoves) {
        this.length = length; // length and height - represent the dimension of the dungeon (always a rectangle);
        this.height = height;
        this.vampires = vampires;
        this.moves = moves; // moves - determines the initial number of moves
        this.vampiresMove = vampiresMoves;//if vampiresMoves is false --> the vampires do not move
        this.player = new Player();
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
}


