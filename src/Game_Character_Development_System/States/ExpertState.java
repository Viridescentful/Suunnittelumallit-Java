package Game_Character_Development_System.States;

import Game_Character_Development_System.Abstract.State;
import Game_Character_Development_System.Machine;
import Game_Character_Development_System.Player;

public class ExpertState extends State {

    public ExpertState(Machine machine) {
        super(machine);
    }

    public void action() {
        Player player = this.getMachine().getPlayer();

        System.out.println("\n--- Expert Level ---\n " + player.getName() + " | Player Health: " + player.getHealth() + ", Experience: " + player.getScore());

        String[] options = {"Exit", "Train", "Meditate", "Fight"};
        switch (this.getMachine().readUserChoice(options)) {
            case 1:
                this.getMachine().setState(new ReadyState(this.getMachine()));
                break;
            case 2:
                Train(player);
                break;
            case 3:
                Meditate(player);
                break;
            case 4:
                Fight(player);
                break;
        }
    }
}
