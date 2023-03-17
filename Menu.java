import java.util.Scanner;

import Core.*;
import Util.Help;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Welcome to LifeGame! Type 'Solo' or 'Multiplayer' to begin. \nFor help type 'help'.");

        Scanner input = new Scanner(System.in);
        while (true) {
            String status = input.nextLine().toLowerCase();

            if (status.equals("solo") == true) 
            {
                new Game();
            }
            else if (status.equals("multiplayer") == true)
            {
                new Lobby();
            }
            else if (status.equals("help"))
            {
                new Help();
            }
            //ask again
            else
            {
                continue;
            }
            input.close(); //prevent memory leak
            break;
        }
    }
}
