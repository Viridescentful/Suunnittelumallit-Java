package Game_Character_Development_System.States;

import Game_Character_Development_System.Abstract.State;
import Game_Character_Development_System.Machine;
import Game_Character_Development_System.Player;

public class ReadyState extends State {
    public ReadyState(Machine machine) {
        super(machine);
    }

    @Override
    public void action() {
        Player player = this.getMachine().getPlayer();

        System.out.println("\n--- Menu ---\n " + player.getName() + " | Player Health: " + player.getHealth() + ", Experience: " + player.getScore());

        String[] options = {"Novice Level", "Intermediate Level", "Expert Level", "Master Level"};
        switch (this.getMachine().readUserChoice(options)) {
            case 1:
                this.getMachine().setState(new NoviceState(this.getMachine()));
                break;
            case 2:
                if (this.getMachine().getPlayer().getScore() < 20) {
                    System.out.println("You need at least 20 experience points to enter Intermediate Level.");
                    return;
                }
                this.getMachine().setState(new IntermediateState(this.getMachine()));
                break;
            case 3:
                if (this.getMachine().getPlayer().getScore() < 50) {
                    System.out.println("You need at least 50 experience points to enter Expert Level.");
                    return;
                }
                this.getMachine().setState(new ExpertState(this.getMachine()));
                break;
            case 4:
                if (this.getMachine().getPlayer().getScore() < 100) {
                    System.out.println("You need at least 100 experience points to enter Master Level.");
                    return;
                }
                this.getMachine().setState(new MasterState(this.getMachine()));
                break;
        }
    }
}
