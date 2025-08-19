package RPG_Map_Generator.Tiles.UniversalTiles;

import RPG_Map_Generator.Abstract.Tile;

public class WaterTile extends Tile {
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
