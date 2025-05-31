import java.util.Scanner;

/**
 * Problem statement:
 *  Write a java program to print a given pattern using method.
 * 
 * Author: Md.Noor Hossain
 */
public class PatternPrinUsingMethod {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int rows = sc.nextInt();
        System.out.print("Maximum star(*) in first row: ");
        int maxStar = sc.nextInt();
        // Display pattern
        PatternMethod(rows, maxStar);
    }

    /*
     * Helper Method
     */
    public static void PatternMethod(int r, int n){
        for(int i = 0; i < r; i++){
            for(int j = n; j > i; j--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
