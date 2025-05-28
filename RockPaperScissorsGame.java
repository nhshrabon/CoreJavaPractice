import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number 0(inclusive) to 3(exclusive)
        int randomNumber0to2 = random.nextInt(3);
        // map computer's choice 1 For Rock 2 for Paper and 3 For Scissors
        int computerChoice = randomNumber0to2 + 1;
        // taking user choice
        System.out.println("Let's play Rock Paper Scissors Game \n\t1.For Rock\n\t2.For Paper\n\t3.For Scissors \nEnter your choice: ");
        int userChoice;
        try{
            userChoice = sc.nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("Please select integer number 1 or 2 or 3.");
            sc.close();
            return;
        }
        // win decide
        boolean computerWin = false;
        boolean userWin = false;
        switch (computerChoice) {
            case 1:
                if (userChoice == 2) {
                    userWin = true;
                }
                break;
            case 2:
                if (userChoice == 3) {
                    userWin = true;
                }
                break;
            case 3:
                if (userChoice == 1) {
                    userWin = true;
                }
                break;
        
            default:
                System.out.println("You enter wrong value! Try again....");
                break;
        }
        System.out.println(userWin ? "Congratulation! You win" : "Sorry! You lossed");
    }
}
