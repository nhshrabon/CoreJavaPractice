import java.util.Scanner;

public class ConvertKilometterToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometters: ");
        float kiloMetter = sc.nextFloat();

        // converting to miles
        // 1 km = 0.621 miles
        float miles = kiloMetter*0.621f;

        // output
        System.out.println("Converted Miles is: "+miles);
    }
}
