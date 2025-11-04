import java.util.Random;
import java.util.Scanner;

public class Game {
    public boolean running = true;

    public int Action_self;
    public int Action_bot;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        Game game = new Game();

        while (game.running){
            System.out.println("let's play the game\npress 0 is rock, press 1 is paper, press 2 is the scissors");
            game.Action_bot = game.random.nextInt(3);
            game.Action_self = game.scanner.nextInt();
            
            //action
            System.out.print("YOU DID:");
            switch (game.Action_self) {
                case 0:
                    System.out.println("rock");
                    break;
                case 1:
                    System.out.println("paper");
                    break;
                case 2:
                    System.out.println("scissors");
                    break;
                default:
                    System.out.println("erro");
                    break;
            }

            System.out.print("BOT DID:");
            switch (game.Action_bot) {
                case 0:
                    System.out.println("rock");
                    break;
                case 1:
                    System.out.println("paper");
                    break;
                case 2:
                    System.out.println("scissors");
                    break;
                default:
                    System.out.println("erro");
                    break;
            }

            //end
            switch (game.Action_self) {
                case 0:
                    switch (game.Action_bot) {
                        case 0:
                            System.out.println("draw");
                            break;
                        case 1:
                            System.out.println("win");
                            break;
                        case 2:
                            System.out.println("lose");
                            break;
                    
                        default:
                            System.out.println("erro");
                            break;
                    }
                    break;
                case 1:
                    switch (game.Action_bot) {
                        case 0:
                            System.out.println("win");
                            break;
                        case 1:
                            System.out.println("draw");
                            break;
                        case 2:
                            System.out.println("lose");
                            break;
                    
                        default:
                            System.out.println("erro");
                            break;
                    }
                    break;
                case 2:
                    switch (game.Action_bot) {
                        case 0:
                            System.out.println("lose");
                            break;
                        case 1:
                            System.out.println("win");
                            break;
                        case 2:
                            System.out.println("draw");
                            break;
                    
                        default:
                            System.out.println("erro");
                            break;
                    }
                    break;
                default:
                    System.out.println("erro");
                    break;
                }

            
            // play again?
            System.out.println("try again? Y/N");
            String inputString = game.scanner.next();
            if (inputString.equals("N") || inputString.equals("n")) {
                System.out.println("Game over!!");
                game.running = false;

            }
            else if (inputString.equals("Y") || inputString.equals("y")) {
                continue;

            }else{
                System.out.println("Game over!!");
                game.running = false;
            }
        }
        game.scanner.close();
    }
}
