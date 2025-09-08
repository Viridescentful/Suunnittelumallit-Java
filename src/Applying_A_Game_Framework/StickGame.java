package Applying_A_Game_Framework;

import Applying_A_Game_Framework.Abstract.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class StickGame extends Game {
    private ArrayList<Player> players;
    private Sticks sticks;
    private Boolean gameEnd;
    private Player gamewinner;
    private int gameTurn;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.sticks = new Sticks();
        this.gameEnd = false;
        this.players = new ArrayList<>();
        this.gameTurn = 0;

        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(new Player("Player " + i));
        }
    }

    @Override
    public boolean endOfGame() {
        return gameEnd;
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        gameTurn++;

        if (player == 0) {
            sticks.initialize();

            if (gameTurn > 1) {
                Player winner = players.getFirst();

                for (Player p : players) {
                    if (p.getCurrentStick() == 0) {
                        continue;
                    }
                    if (winner == null || p.getCurrentStick() > winner.getCurrentStick()) {
                        winner = p;
                    }
                }

                assert winner != null;

                if (winner.getCurrentStick() == 6) {
                    for (Player p : players) {
                        if (p.getCurrentStick() == 0) {
                            winner = p;
                        }
                    }
                }

                if (winner.getCurrentStick() == 0) {
                    System.out.println(winner.getName() + " wins the round with pity!");
                } else {
                    System.out.println(winner.getName() + " wins the round with " + winner.getCurrentStick());
                }

                winner.setScore(winner.getScore() + 1);

                if (winner.getScore() == 3) {
                    gamewinner = winner;
                    gameEnd = true;
                    return;
                }

                for (Player p : players) {
                    p.setCurrentStick(0);
                }
            }
        }

        Player currentPlayer = players.get(player);
        System.out.println(currentPlayer.getName() + "'s turn.");

        System.out.print("Enter number of sticks to draw (1-"+ sticks.size() + "): ");
        int numberOfSticks = scanner.nextInt();

        int drawnStick = sticks.draw(numberOfSticks);
        System.out.println(currentPlayer.getName() + " drew a stick with value: " + drawnStick);
        currentPlayer.setCurrentStick(drawnStick);
    }

    @Override
    public void displayWinner() {
        System.out.println(gamewinner.getName() + " wins the game!");
    }
}
