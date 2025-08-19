package RPG_Map_Generator.Abstract;

import RPG_Map_Generator.Abstract.Tile;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Map {
    public void play() {
        Tile[][] matrix = new Tile[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = createTile();
            }
        }

        System.out.println("Display:");
        for (Tile[] tiles : matrix) {
            for (Tile tile : tiles) {
                System.out.print(tile + " ");
            }
            System.out.println(); // Move to the next row
        }

        int currentRow = 0;
        int currentCol = 0;

        Scanner sc = new Scanner(System.in);

        Tile tile;

        do {

            tile = matrix[currentRow][currentCol];
            System.out.println(tile.getDescription());;
            tile.action();
            System.out.println();
            System.out.println("Press enter to move to the next room ('q' to quit).");
            System.out.println();

            if (currentCol < matrix[currentRow].length - 1) {
                currentCol++;
            } else if (currentRow < matrix.length - 1) {
                currentRow++;
                currentCol = 0;
            } else {
                currentRow = 0;
                currentCol = 0;
                System.out.println("Reached the end of the map, starting over.");
            }
        } while (!sc.nextLine().equals("q"));
    }

    public Tile returnrandomtile(ArrayList<Tile> tiles) {
        int randomIndex = (int) (Math.random() * tiles.size());
        Tile randomTile = tiles.get(randomIndex);

        return randomTile;
    }

    public abstract Tile createTile();
}
