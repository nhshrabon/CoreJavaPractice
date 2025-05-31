import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem statement:
 *  Write a java program to print fibonacci sequence using recursive method.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        // Createing Scanner object 
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements/numbers you want : ");
        int size = sc.nextInt();

        // Invalid size issue
        if (size < 0) {
            System.out.println("Number of elements can not be negative");
            return;
        }

        // Create fibonacci sequence
        int[] fibSequence = new int[size];

        // Generate the sequence number
        for(int i = 0; i < size; i++){
            fibSequence[i] = fibonacciSequence(i);
        }

        // Display result
        for(int i = 0; i < size; i++){
            System.out.print(fibSequence[i]);
            System.out.print(",");
        }
        System.out.println();
    }

    // Helper method
    public static int fibonacciSequence(int n){
        if (n <= 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else{
            int result = fibonacciSequence(n-1)+fibonacciSequence(n-2);
            return result;
        }
    }
}
