package Game_Character_Development_System.Abstract;

import Game_Character_Development_System.Clamp;
import Game_Character_Development_System.Machine;
import Game_Character_Development_System.Player;

public abstract class State {
    private Machine machine;
    private Clamp clamp = new Clamp();

    public State(Machine machine) {
        this.machine = machine;
    }

    public Machine getMachine() {
        return machine;
    }

    public void Train(Player player) {
        System.out.println("Training to the next level...");
        player.setScore(player.getScore() + 5);
    }

    public void Meditate(Player player) {
        System.out.println("Meditating to gain wisdom...");
        player.setHealth(clamp.clamp(player.getHealth() + 10, 0, 100));
    }

    public void Fight(Player player) {
        System.out.println("Engaging in a battle...");

        if (player.getHealth() <= 10) {
            System.out.println("You are too weak to fight. Please meditate first.");
            return;
        }

        player.setHealth(clamp.clamp(player.getHealth() - 10, 0, 100));
        player.setScore(player.getScore() + 10);
    }

    public abstract void action();
}
