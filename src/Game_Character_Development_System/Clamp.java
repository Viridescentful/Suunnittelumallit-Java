package Game_Character_Development_System;

public class Clamp {
    public int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }
}
