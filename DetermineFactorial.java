/*
 * Problem statement:
 *  Write a java program to determine the fectorial of a given number.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
import java.util.Scanner;

public class DetermineFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any whole number to make factorial: ");
        int num = sc.nextInt();

        // determine factoral using for loop
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
