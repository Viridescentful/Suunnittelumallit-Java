package RPG_Map_Generator.Maps;

import RPG_Map_Generator.Abstract.Map;
import RPG_Map_Generator.Abstract.Tile;
import RPG_Map_Generator.Tiles.UniversalTiles.WaterTile;
import RPG_Map_Generator.Tiles.WildernessTiles.ForestTile;
import RPG_Map_Generator.Tiles.WildernessTiles.SwampTile;

import java.util.ArrayList;

public class WildernessMap extends Map {
    ArrayList<Tile> tiles = new ArrayList<Tile>();

    public WildernessMap() {
        tiles.add(new ForestTile());
        tiles.add(new SwampTile());
        tiles.add(new WaterTile());
    }

    @Override
    public Tile createTile() {
        return returnrandomtile(tiles);
    }
}
