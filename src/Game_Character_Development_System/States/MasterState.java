package Game_Character_Development_System.States;

import Game_Character_Development_System.Abstract.State;
import Game_Character_Development_System.Machine;
import Game_Character_Development_System.Player;

public class MasterState extends State {

    public MasterState(Machine machine) {
        super(machine);
    }

    public void action() {
        Player player = this.getMachine().getPlayer();

        System.out.println("\n--- Master Level ---\n " + player.getName() + " | Player Health: " + player.getHealth() + ", Experience: " + player.getScore());

        this.getMachine().setState(null);
    }
}
