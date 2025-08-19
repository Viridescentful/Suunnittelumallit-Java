package RPG_Map_Generator.Tiles.CityTiles;

import RPG_Map_Generator.Abstract.Tile;

public class RoadTile extends Tile {
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
