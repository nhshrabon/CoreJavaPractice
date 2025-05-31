import java.util.Scanner;

/**
 * Problem statement:
 *  Write a java program to calculate factorial of a number(recursive must be used).
 * 
 * Author:Md.Noor Hossain Shrabon
 */
public class CalculateFactorialUsingRecursive {
    public static void main(String[] args) {
        // Create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to calculate factorial: ");
        int num = sc.nextInt();
        // Calculating factorial
        int ans = factorial(num);
        // Display result
        System.out.println("The factorial of "+num+" is : "+ans);
    }

    public static int factorial(int a){
        int result;
        if (a == 0 || a == 1) {
            result = 1;
            return result;
        }else{
            result = a * factorial(a-1);
            return result;
        }
    }
}
