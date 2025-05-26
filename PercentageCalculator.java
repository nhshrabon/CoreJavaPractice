import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first subject marks: ");
        int firstMark = sc.nextInt();
        System.out.print("Enter second subject marks: ");
        int secondMark = sc.nextInt();
        System.out.print("Enter third subject marks: ");
        int thirdMark = sc.nextInt();
        System.out.print("Enter fourth subject marks: ");
        int fourthMark = sc.nextInt();
        System.out.print("Enter fifth subject marks: ");
        int fifthMark = sc.nextInt();

        // calculation
        float marksSum = fifthMark + secondMark + thirdMark + fourthMark + fifthMark;
        
        float res = marksSum/5;

        System.out.println("Percentage of the given marks: "+res);
    }
}