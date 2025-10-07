package Flyweight_Rendering_For_RPG.Maps;

import Flyweight_Rendering_For_RPG.Abstract.Map;
import Flyweight_Rendering_For_RPG.Tiles.UniversalTiles.WaterTile;
import Flyweight_Rendering_For_RPG.Tiles.WildernessTiles.ForestTile;
import Flyweight_Rendering_For_RPG.Tiles.WildernessTiles.SwampTile;
import Flyweight_Rendering_For_RPG.Abstract.Tile;
import javafx.stage.Stage;

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
