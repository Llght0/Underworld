import java.util.Scanner;

import Core.Game;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Welcome to LifeGame! Type 'Solo' or 'Multiplayer' to begin. \nFor help type 'help'.");

        Scanner input = new Scanner(System.in);
        while (true) {
            String status = input.nextLine().toLowerCase();

            if (status.equals("solo") == true || status.equals("multiplayer") == true) 
            {
                new Game();
            }
            else if (status.equals("help"))
            {
                new Help();
            }
            else
            {
                continue;
            }
            input.close();
            break;
        }
    }
}