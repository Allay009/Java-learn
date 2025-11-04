import java.util.Random;
import java.util.Scanner;

import javax.swing.Action;

public class Game {
    public boolean running = true;

    public int Action_self;
    public int Action_bot;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        Game game = new Game();

        while (game.running){
            game.Action_bot = game.random.nextInt(3);
            System.out.println("let's play the game\npress 0 is rock, press 1 is paper, press 2 is the scissors");

            game.running = false;
      }
    }
}