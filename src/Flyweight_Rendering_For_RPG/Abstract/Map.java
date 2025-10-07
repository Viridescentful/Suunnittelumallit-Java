package Flyweight_Rendering_For_RPG.Abstract;

import Flyweight_Rendering_For_RPG.Abstract.Tile;
import Flyweight_Rendering_For_RPG.GraphicalInterface;
import Flyweight_Rendering_For_RPG.TileGraphicFactory;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
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

        GraphicalInterface.setMatrix(matrix);
        GraphicalInterface.launch(GraphicalInterface.class);
    }

    public Tile returnrandomtile(ArrayList<Tile> tiles) {
        int randomIndex = (int) (Math.random() * tiles.size());
        Tile randomTile = tiles.get(randomIndex);

        return randomTile;
    }

    public abstract Tile createTile();
}
