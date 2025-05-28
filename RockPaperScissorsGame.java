import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        
        System.out.println("How many round you want to play?");
        int numRounds;
        try{
            numRounds = sc.nextInt();
            if (numRounds <= 0) {
                System.out.println("Please enter a positive number of rounds.");
                sc.close();
                return;
            }
        } catch(InputMismatchException e){
            System.out.println("Pleae enter a whole number of rounds.");
            sc.close();
            return;
        }

        int countComputerWin = 0;
        int countUserWin = 0;
        int countDraw = 0;
        int currentRound = 1;

        while (currentRound <= numRounds) {
            System.out.println("\n----Round "+currentRound+" --------");            
            // computer choice generate for each round
            int computerChoice = random.nextInt(3)+1;

            int userChoice;
            while (true) { // untile valid input is received
                System.out.println("Enter your choice:");
                System.out.println("\t1. Rock");
                System.out.println("\t2. Paper");
                System.out.println("\t3. Scissors");
                System.out.print("Your choice: ");

                try{
                    userChoice = sc.nextInt();
                    if (userChoice >= 1 && userChoice <= 3) {
                        break;
                    }else{
                        System.out.println("Invalid input. Please enter 1, 2 or 3..");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Invalid input! Please enter 1, 2 or 3...");
                    sc.next();
                }
            }

            // Display choices
            String computerMove = mapChoiceToString(computerChoice);
            String userMove = mapChoiceToString(userChoice);
            System.out.println("Computer choice: "+computerChoice);
            System.out.println("User choice: "+userChoice);

            // Determine winner for the current rounds
            if (userChoice == computerChoice) {
                System.out.println("It's a Draw!");
                countDraw++;
            }else if ((userChoice == 1 && computerChoice == 3)||
                      (userChoice == 2 && computerChoice == 1) ||
                      (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win this rounds!");
                countUserWin++;
            }else{
                System.out.println("Computer win this round!");
                countComputerWin++;
            }
            currentRound++;
        }

        // Display Tournament Result
        System.out.println("\n ------- Tournament Result ------");
        System.out.println("You wins      : "+countUserWin);
        System.out.println("Computer wins : "+countComputerWin);
        System.out.println("Draws         : "+countDraw);

        // Calculate and display tournament winner
        if (countUserWin > countComputerWin) {
            System.out.println("Congratulation! You win the tournament..");
        }else if (countComputerWin > countUserWin) {
            System.out.println("Sorry! Computer win the tournament..");
        }else{
            System.out.println("The tournament is a Draw!");
        }

    }

    // Helper method to map integer to string
    public static String mapChoiceToString(int choice){
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
