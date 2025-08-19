package RPG_Map_Generator.Tiles.WildernessTiles;

import RPG_Map_Generator.Abstract.Tile;

public class ForestTile extends Tile {
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
