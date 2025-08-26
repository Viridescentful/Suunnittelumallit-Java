package RPG_Map_Generator.Abstract;

import RPG_Map_Generator.Abstract.Tile;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Map {
    Tile[][] matrix = new Tile[20][20];

    public void Display() {
        System.out.println("Display:");
        for (Tile[] tiles : matrix) {
            for (Tile tile : tiles) {
                System.out.print(tile + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void play() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = createTile();
            }
        }

        Display();

        int currentRow = 0;
        int currentCol = 0;

        Scanner sc = new Scanner(System.in);

        Tile tile;

        do {

            tile = matrix[currentRow][currentCol];
            System.out.println(tile.getDescription());;
            tile.action();
            System.out.println();
            System.out.println("Move to the next tile with enter, or type 'Exit' to quit.");
            System.out.println();

            if (currentCol < matrix[currentRow].length - 1) {
                currentCol++;
            } else if (currentRow < matrix.length - 1) {
                currentRow++;
                currentCol = 0;
            } else {
                currentRow = 0;
                currentCol = 0;

                System.out.println("[------------------------------------------------]");
                System.out.println("    Reached the end of the map, starting over!");
                System.out.println("[------------------------------------------------]");
            }
        } while (!sc.nextLine().equals("Exit"));
    }

    public Tile returnrandomtile(ArrayList<Tile> tiles) {
        int randomIndex = (int) (Math.random() * tiles.size());
        Tile randomTile = tiles.get(randomIndex);

        return randomTile;
    }

    public abstract Tile createTile();
}
