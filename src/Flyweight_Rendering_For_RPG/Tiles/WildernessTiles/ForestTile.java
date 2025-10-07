package Flyweight_Rendering_For_RPG.Tiles.WildernessTiles;

import Flyweight_Rendering_For_RPG.Abstract.Tile;
import Flyweight_Rendering_For_RPG.TileGraphicFactory;

public class ForestTile extends Tile {
    public ForestTile() {
        super(TileGraphicFactory.getTileImage("ForestTile"));
    }

    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public String getDescription() {
        return "This is a Forest Tile, peaceful and full of a variety of trees.";
    }

    @Override
    public void action() {
        System.out.println("You entered a Forest Tile");
    }

    @Override
    public String toString() {
        return getCharacter();
    }
}
