import java.util.Scanner;

public class ReplaceSpaceIntoUnderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String whith space: ");
        String str = sc.nextLine();
        System.out.println("After Replace space with underscore: "+ str.replaceAll(" ", "_"));
    }
}
