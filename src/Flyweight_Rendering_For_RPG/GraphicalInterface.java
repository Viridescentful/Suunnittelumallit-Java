package Flyweight_Rendering_For_RPG;

import Flyweight_Rendering_For_RPG.Abstract.Tile;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GraphicalInterface extends Application {
    private static Tile[][] matrices;

    public static void setMatrix(Tile[][] matrix) {
        matrices = matrix;
    }

    @Override
    public void start(Stage stage) {
        if (matrices == null) return;

        int rows = matrices.length;
        int cols = matrices[0].length;
        int tileSize = 20;

        Canvas canvas = new Canvas(cols * tileSize, rows * tileSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Tile tile = matrices[row][col];
                if (tile != null && tile.getImage() != null) {
                    gc.drawImage(tile.getImage(), col * tileSize, row * tileSize, tileSize, tileSize);
                }
            }
        }

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("RPG Map");
        stage.show();
    }
}
