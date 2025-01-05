package dev.desktop;
import java.util.Scanner;

public class Game {
    public static double version = 0.1;
    public static void main(String[] args) {
        System.out.println("glassBridge:v" + version);
        String answer = ask("Create a new player? Y, n");
        if ("Y".equals(answer)) {
            answer = ask("Enter your player number, 1 - 456");
            player n = new player(Integer.parseInt(answer));
            //todo implement checking of number
        }
    }

    /**
     * @param message
     * @return input
     */
 public static String ask(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
