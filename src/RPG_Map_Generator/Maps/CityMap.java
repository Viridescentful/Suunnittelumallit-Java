package RPG_Map_Generator.Maps;

import RPG_Map_Generator.Abstract.Map;
import RPG_Map_Generator.Abstract.Tile;
import RPG_Map_Generator.Tiles.CityTiles.BuildingTile;
import RPG_Map_Generator.Tiles.CityTiles.RoadTile;
import RPG_Map_Generator.Tiles.UniversalTiles.WaterTile;

import java.util.ArrayList;

public class CityMap extends Map {
    ArrayList<Tile> tiles = new ArrayList<Tile>();

    public CityMap() {
        tiles.add(new RoadTile());
        tiles.add(new BuildingTile());
        tiles.add(new WaterTile());
    }

    @Override
    public Tile createTile() {
        return returnrandomtile(tiles);
    }
}
