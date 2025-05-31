import java.util.Scanner;

/**
 * Problem statement:
 *  Write a java program to print a given pattern (one star in last line 2 star in second last line....) using recursive.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
public class PrintPatternUsingRecursion {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int row = sc.nextInt();
        // Display result
        getPattern(row);
    }

    /*
     * Helper Method(Recursive)
     */
    public static void getPattern(int n){
        if (n > 0) {
           
            for(int i = n; i > 0; i--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            getPattern(n-1);
        }
    }
}
