package Applying_A_Game_Framework;

public class Player {
    private String Name;
    private int Score;
    private int CurrentStick;

    public Player(String name) {
        this.Name = name;
        this.Score = 0;
        this.CurrentStick = 0;
    }

    public String getName() {
        return Name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getCurrentStick() {
        return CurrentStick;
    }

    public void setCurrentStick(int currentStick) {
        CurrentStick = currentStick;
    }
}
