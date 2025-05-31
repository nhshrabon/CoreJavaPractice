import java.util.Scanner;

/**
 * Problem statement:
 *  Write a java program to catculate sum of first n natural numbers using recursive method.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
public class SumOfFirstNNumber {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to calculate sum: ");
        int num = sc.nextInt();
        // Calculate result using recursive method
        int result = SumOfNaturalNumber(num);
        // Display result
        System.out.println("Sum of first "+num+" natural numbers is :"+result);
    }

    /*
     * Helper Method
     */
    public static int SumOfNaturalNumber(int n){
        int sum = 0;
        if (n == 1) {
            sum = 1; 
            return sum;
        }else{
            sum += n + SumOfNaturalNumber(n-1);
            return sum;
        }
    }
}
