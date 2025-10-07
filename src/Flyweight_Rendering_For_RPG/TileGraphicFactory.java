package Flyweight_Rendering_For_RPG;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TileGraphicFactory {
    private static final Map<String, Image> imageCache = new HashMap<>();

    public static Image getTileImage(String tileName) {
        if (imageCache.containsKey(tileName)) {
            return imageCache.get(tileName);
        }

        String path = "/Resources/Tiles/" + tileName + ".png";

        Image image = new Image(Objects.requireNonNull(TileGraphicFactory.class.getResourceAsStream(path)));

        imageCache.put(tileName, image);

        return image;
    }
}
