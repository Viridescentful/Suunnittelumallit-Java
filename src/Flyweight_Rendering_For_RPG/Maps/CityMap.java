package Flyweight_Rendering_For_RPG.Maps;

import Flyweight_Rendering_For_RPG.Abstract.Map;
import Flyweight_Rendering_For_RPG.Abstract.Tile;
import Flyweight_Rendering_For_RPG.Tiles.CityTiles.RoadTile;
import Flyweight_Rendering_For_RPG.Tiles.CityTiles.BuildingTile;
import Flyweight_Rendering_For_RPG.Tiles.UniversalTiles.WaterTile;
import Flyweight_Rendering_For_RPG.Tiles.WildernessTiles.ForestTile;
import Flyweight_Rendering_For_RPG.Tiles.WildernessTiles.SwampTile;
import javafx.stage.Stage;

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
