import java.util.Scanner;

public class CalculatingGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first subject mark: ");
        float firstMark = sc.nextFloat();
        System.out.println("Enter second subject mark: ");
        float secondMark = sc.nextFloat();
        System.out.println("Enter third subject mark: ");
        float thirdMark = sc.nextFloat();
        //calculation avarage marks
        float avgMark = (firstMark + secondMark + thirdMark)/3;
        // claculating gpa
        String gpa;

        if (avgMark < 33) {
            gpa = "F";
        }else if (avgMark < 40) {
            gpa = "D";
        }else if (avgMark < 50) {
            gpa = "C";
        }else if (avgMark < 60) {
            gpa = "B";
        }else if (avgMark < 70) {
            gpa = "A-";
        }else if (avgMark < 80) {
            gpa = "A";
        }else{
            gpa = "A+";
        }
        // output
        System.out.println("The GPA of the student is: "+gpa);
    }
}
