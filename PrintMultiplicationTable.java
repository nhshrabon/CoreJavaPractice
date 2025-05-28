/*
 * Problem statement:
 *  Write a java program to print multiplication table of a given number n
 * 
 * Author: Md.Noor Hossain Shrabon
 */
import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("How many rows you want? ");
        int row = sc.nextInt();

        // display
        System.out.println("\n------ Multiplication Table -----------");
        for(int i = 1; i <= row; i++){
            System.out.printf("%d X %d = %d",n,i,n*i);
            System.out.println();
        }
    }
}
