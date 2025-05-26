import java.util.Scanner;

public class SumThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice(i for integer and f for float): ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'i':
                System.out.print("Enter first number: ");
                int firstNumb = sc.nextInt();
                System.out.print("Enter second number: ");
                int secondNumb = sc.nextInt();
                System.out.print("Enter third number: ");
                int thirdNumb = sc.nextInt();

                // sum calculation
                int sum = firstNumb + secondNumb + thirdNumb;

                // output 
                System.out.println("The sum of given three numbers is: "+ sum);
                break;
            case 'f':
                System.out.print("Enter first number: ");
                float firstFloatNumb = sc.nextFloat();
                System.out.print("Enter second number: ");
                float secondFloatNumb = sc.nextFloat();
                System.out.print("Enter third number: ");
                float thirdFloatNumb = sc.nextFloat();

                // sum calculation
                float floatSum = firstFloatNumb + secondFloatNumb + thirdFloatNumb;

                // output 
                System.out.println("The sum of given three numbers is: "+ floatSum);
                break;
            default:
                System.out.println("You chosse wrongly!");
                break;
        }
        
    }
}
