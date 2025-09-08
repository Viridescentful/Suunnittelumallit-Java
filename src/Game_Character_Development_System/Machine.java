package Game_Character_Development_System;

import Game_Character_Development_System.Abstract.State;
import Game_Character_Development_System.States.ReadyState;

import java.util.Scanner;

public class Machine {
    private static Scanner scanner = new Scanner(System.in);
    private State state;
    private Player player;

    public Machine(String playerName) {
        state = new ReadyState(this);
        player = new Player(playerName);
    }

    public void operate() {
        while (true) {
            if (state == null) {
                // should never happen
                System.out.println("The game has ended");
                return;
            }
            state.action();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int readUserChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");

        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input

        return scanner.nextInt();
    }

    public Player getPlayer() {
        return player;
    }
}
