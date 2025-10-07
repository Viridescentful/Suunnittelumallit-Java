package Flyweight_Rendering_For_RPG.Tiles.WildernessTiles;

import Flyweight_Rendering_For_RPG.Abstract.Tile;
import Flyweight_Rendering_For_RPG.TileGraphicFactory;

public class SwampTile extends Tile {
    public SwampTile() {
        super(TileGraphicFactory.getTileImage("SwampTile"));
    }

    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getDescription() {
        return "This is a Swamp Tile, full of muck and mud";
    }

    @Override
    public void action() {
        System.out.println("You entered a Swamp Tile");
    }

    @Override
    public String toString() {
        return getCharacter();
    }
}
