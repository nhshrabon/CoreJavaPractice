import java.util.Scanner;

/**
 * Program statement:
 *  Write a java program to convert Celsius temperature to Faherenheit using method.
 * 
 * Author: Md.Noor Hossain Shrabon
 */
public class ConverCelsiusToFaherenheit {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature in Celsius: ");
        float Celsius = sc.nextFloat();
        // Get result
        float ans = getFaherenheit(Celsius);
        // Display result
        System.out.println("Temperature in Fahrentheit is "+ans);
    }

    // Helper Method
    public static float getFaherenheit(float c){
        float F = 9*c/5+32;
        return F;
    }
}
