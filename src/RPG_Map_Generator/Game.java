package RPG_Map_Generator;

import RPG_Map_Generator.Abstract.Map;
import RPG_Map_Generator.Maps.CityMap;
import RPG_Map_Generator.Maps.WildernessMap;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        ArrayList<Map> maps = new ArrayList<>();

        maps.add(new CityMap());
        maps.add(new WildernessMap());

        int randomIndex = (int) (Math.random() * maps.size());
        Map randomMap = maps.get(randomIndex);

        randomMap.play();
    }
}
