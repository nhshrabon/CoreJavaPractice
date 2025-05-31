import java.util.Scanner;

/**
 * Program statemet:
 *  Write a java program to print nth trum of fibonacci sequent using recursion.
 * 
 * Author: Md. Noor Hossain Shrabon
 */
public class NthTurmsFibonacciSequence {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Gate Nth number
        System.out.print("How many number do you want in the series? ");
        int n = sc.nextInt();
        // Invalid input case
        if (n < 0) {
            System.out.println("Number of a serice can not be negative!");
            return;
        }

        // Display Result
        int ans = getFibonacciSequence(n);
        System.out.println("The "+n+" th element/number of the fibonacci sequence is "+ans);
    }

    /*
     * Recursive Method to generate fibonacci sequence
     */
    public static int getFibonacciSequence(int n){
        if (n == 1) {
            return 0;
        }else if (n == 2) {
            return 1;
        }else{
            return  getFibonacciSequence(n-1)+getFibonacciSequence(n-2);
        }
    }
}
