import java.util.Scanner;

/**
 * Problem statements:
 *  Write a java Program to print a multiplication table using method.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
public class MultiplicationTableUsingMethod {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int num = sc.nextInt();
        System.out.print("Enter the range of table: ");
        int size = sc.nextInt();

        // Display result
        multiplication(num, size);
    }

    // Helper method for multiplication talbe
    public static void multiplication(int n, int size){
        for(int i = 1; i <= size; i++){
            System.out.format("%d X %d = %d\n",n, i, n*i);
        }
    }
}
