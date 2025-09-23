package Applying_A_Game_Framework;

import Applying_A_Game_Framework.Abstract.Game;


public class Main {
    public static void main(String[] args) {
        Game game = new StickGame();
        game.play(1);
    }
}
