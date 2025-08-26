package RPG_Map_Generator.Tiles.CityTiles;

import RPG_Map_Generator.Abstract.Tile;

public class BuildingTile extends Tile {
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
