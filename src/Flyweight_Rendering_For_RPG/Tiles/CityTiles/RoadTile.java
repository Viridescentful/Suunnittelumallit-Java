package Flyweight_Rendering_For_RPG.Tiles.CityTiles;

import Flyweight_Rendering_For_RPG.Abstract.Tile;
import Flyweight_Rendering_For_RPG.TileGraphicFactory;

public class RoadTile extends Tile {
    public RoadTile() {
        super(TileGraphicFactory.getTileImage("RoadTile"));
    }

    @Override
    public String getCharacter() {
        return "R";
    }

    @Override
    public String getDescription() {
        return "A road tile, part of the city infrastructure.";
    }

    @Override
    public void action() {
        System.out.println("You entered a Road Tile");
    }

    @Override
    public String toString() {
        return getCharacter();
    }
}
