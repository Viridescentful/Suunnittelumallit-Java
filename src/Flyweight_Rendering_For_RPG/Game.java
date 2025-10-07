package Flyweight_Rendering_For_RPG;

import Flyweight_Rendering_For_RPG.Abstract.Map;
import Flyweight_Rendering_For_RPG.Maps.WildernessMap;
import Flyweight_Rendering_For_RPG.Maps.CityMap;

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
