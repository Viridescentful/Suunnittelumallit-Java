package Flyweight_Rendering_For_RPG.Tiles.CityTiles;

import Flyweight_Rendering_For_RPG.Abstract.Tile;
import Flyweight_Rendering_For_RPG.TileGraphicFactory;

public class BuildingTile extends Tile {
    public BuildingTile() {
        super(TileGraphicFactory.getTileImage("BuildingTile"));
    }

    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getDescription() {
        return "This is a Building Tile, typically found in urban areas.";
    }

    @Override
    public void action() {
        System.out.println("You entered a Building Tile");
    }

    @Override
    public String toString() {
        return getCharacter();
    }
}
