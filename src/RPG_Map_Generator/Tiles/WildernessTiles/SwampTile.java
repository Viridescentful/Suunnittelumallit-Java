package RPG_Map_Generator.Tiles.WildernessTiles;

import RPG_Map_Generator.Abstract.Tile;

public class SwampTile extends Tile {
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
