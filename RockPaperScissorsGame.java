package CWHEx02RockPaperScissorsGame;

// Importing java.util.Scanner to get input from user.
// Importing java.util.Random to make computer choose Rock or Paper Or Scissor
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        // Variable Declaration
        Scanner sc = new Scanner(System.in);
        Random var = new Random();
        System.out.println("Hello Sir, Welcome to our Rock, Paper, Scissor Game\nEnter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissor.");
        System.out.println("Enter your number : ");
        int userInput = sc.nextInt();
        int computerInput = var.nextInt(1,3);


        //User Input
        switch (userInput) {
            case 1:
                System.out.println("You choose Rock.");
                break;
            case 2:
                System.out.println("You choose Paper.");
                break;
            case 3:
                System.out.println("You choose Scissor.");
                break;
            default:
                System.out.println("Please select a valid input.");
                break;
        }

        // Computer Input

        if (userInput <= 3) {
            switch (computerInput) {
                case 1:
                    System.out.println("Computer choose Rock.");
                    break;
                case 2:
                    System.out.println("Computer choose Paper.");
                    break;
                case 3:
                    System.out.println("Computer choose Scissor.");
                    break;
            }
        } else {
            System.out.println(" ");
        }

//        Winner Declaration


        if (userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 3 || userInput == 3 && computerInput == 1) {
            System.out.println("Computer won!");
        } else if (userInput == computerInput) {
            System.out.println("Both choose same. No one won.");
        } else if (userInput > 3) {
            System.out.println("It is an invalid input. Game cannot proceed further.");
        } else {
            System.out.println("Congrats! you won the match.");
        }
    }
}
