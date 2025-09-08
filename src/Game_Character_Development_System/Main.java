package Game_Character_Development_System;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name:");

        String name = scanner.nextLine();

        Machine machine = new Machine(name);
        machine.operate();
    }
}
