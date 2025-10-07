package Flyweight_Rendering_For_RPG.Abstract;

import javafx.scene.image.Image;

public abstract class Tile {
    protected Image image;

    public Tile(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public abstract String getCharacter();
    public abstract String getDescription();
    public abstract void action();

    @Override
    public String toString() {
        return getCharacter();
    }
}
