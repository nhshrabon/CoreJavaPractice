import java.util.Scanner;

/**
 * Problem statements:
 *  Write a java program to find avrage of a set of numbers passed as varguments.
 * 
 * Author: Md. Noor Hossain Shrabon
 */
public class CalculateAverageUsingVargArgs {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("How many arguments to pass: ");
        int n = sc.nextInt();
        // Initialize array
        int[] numbers = new int[n];
        // Get value
        for(int i = 0; i < n; i++){
            System.out.print("Enter "+(i+1)+" th argument: ");
            numbers[i] = sc.nextInt();
        }
        // Calculating Average using varguments
        float result = getAverage(numbers);
        // Display result
        System.out.println("Average of the given numbers is "+result);
    }

    /*
     * Helper Method
     */
    public static float getAverage(int... args){
        int n = args.length;
        float sum = 0;
        for(int e:args){
            sum += e;
        }
        return sum/n;
    }
}
