package Game_Character_Development_System;

public class Player {
    private String Name;
    private int Health;
    private int Score;
    private int Level;

    public Player(String name) {
        this.Name = name;
        this.Health = 100;
        this.Score = 0;
        this.Level = 1;
    }

    public String getName() {
        return Name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }
}
