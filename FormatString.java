import java.util.Scanner;

public class FormatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Dear "+ name +", \n\t This java course is nice.\n\t Thanks.");
    }
}
