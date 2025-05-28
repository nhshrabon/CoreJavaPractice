import java.util.Scanner;

public class DetectDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day's number:");
        int num = sc.nextInt();

        // detecting day's name
        switch (num) {
            case 1:
                System.out.println("This is Monday.");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thusday");
                break;
            case 5:
                System.out.println("This is Thursday");
                break;
            case 6:
                System.out.println("This is Friday");
                break;
            case 7:
                System.out.println("This is Saturday");
                break;
        
            default:
                System.out.println("You input wrong! Try again...");
                break;
        }
    }
}
