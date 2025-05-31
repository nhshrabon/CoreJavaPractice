import java.util.Scanner;

/**
 * Problem statement:
 *  Write a java program to print a given pattern using method.
 * 
 * Author: Md. Noor Hossain Shrabon
 */
public class PrintPatternUsingMethod {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows you want to print: ");
        int row = sc.nextInt();
        // Display result
        pattern(row);
    }

    // Helper method
    public static void pattern(int row){
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
