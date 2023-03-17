package Core;

import java.util.Scanner;

public class Lobby {
    public static void main(String[] args) {
        System.out.println("Create or join multiplayer lobby?");

        Scanner input = new Scanner(System.in);
        while (true)
        {
            String status = input.nextLine();
            if (status.equals("create") == true)
            {
                System.out.println("creating server!");
                break;
            }
            else if (status.equals("join") == true)
            {
                System.out.print("Enter ip address: ");
                String ip = input.nextLine();
                break;
            }
            else
            {
                continue;
            }
        }
        input.close();
    }
}
