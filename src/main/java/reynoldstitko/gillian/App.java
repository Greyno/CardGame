package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/27/17.
 */
public class App {
    public static void main(String[] args) {

        Game theGame = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to Dr. G's casino!\n");
        System.out.print("Choose a game to play: 1 - BlackJack or 2 - Go Fish: ");

        int chooseGame = scanner.nextInt();

        switch (chooseGame) {
            case 1: {
                theGame = new BlackJackGame();
                System.out.print("You chose to play BlackJack!\n");
                break;
            }

            case 2: {
                theGame = new GoFishGame();
                System.out.print("You chose to play Go Fish!\n");
                break;
            }
            default:{
                System.out.println("You did not choose a game!");
                break;
            }
        }
        theGame.start();
        scanner.close();
    }
}
