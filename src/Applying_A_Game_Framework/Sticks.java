package Applying_A_Game_Framework;

import java.util.Collections;
import java.util.ArrayList;

public class Sticks {
    private ArrayList<Integer> Sticks;

    public Sticks() {
        this.Sticks = new ArrayList<>();
    }

    public void initialize() {
        this.Sticks.clear();
        for (int i = 1; i <= 6; i++) {
            this.Sticks.add(i);
        }
        Collections.shuffle(this.Sticks);
    }

    public int draw(Integer sticknumber) {
        if (sticknumber < 0 || sticknumber >= this.Sticks.size()) {
            return this.Sticks.removeFirst();
        } else {
            return this.Sticks.remove((int) sticknumber);
        }
    }

    public int size() {
        return this.Sticks.size();
    }
}
