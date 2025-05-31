import java.util.Scanner;

/**
 * Problem statements:
 *  Write a java program to print a given start pattern (1 star in the first line
 *  2 star in the second line 3 star in the third line etc..) using recursive.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
public class PrintPatternUsingRecursive {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int rows = sc.nextInt();
        // Display result
        getPattern(rows);
    }

    /*
     * Helper Method (recursive)
     */
    public static void getPattern(int n){
        if (n > 0) {
            getPattern(n-1);
            for(int i = 0; i < n; i++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
