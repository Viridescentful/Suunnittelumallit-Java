package Flyweight_Rendering_For_RPG.Tiles.UniversalTiles;

import Flyweight_Rendering_For_RPG.Abstract.Tile;
import Flyweight_Rendering_For_RPG.TileGraphicFactory;

public class WaterTile extends Tile {
    public WaterTile() {
        super(TileGraphicFactory.getTileImage("WaterTile"));
    }

    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public String getDescription() {
        return "This is a Water Tile, there is nothing but water.";
    }

    @Override
    public void action() {
        System.out.println("You entered a Water Tile");
    }

    @Override
    public String toString() {
        return getCharacter();
    }
}
