import java.util.Scanner;

public class ConvertStringToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Converted to Lowercase string : "+ str.toLowerCase());
    }
}
