import java.util.Scanner;

public class DetectingIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        boolean input = sc.hasNextInt();
        System.out.println(input);
    }
}
