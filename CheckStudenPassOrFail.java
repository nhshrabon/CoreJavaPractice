/*
 * Problem statement:
 * Write a java program to determine a student is pass or fail in exam.
 * consider pass if he/she get atlist 40% of total marks and atlist 33% in any subject.
 * 
 * Author: Md. Noor Hossain Shrabon 
 */
import java.util.Scanner;

public class CheckStudenPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total subject: ");
        int n = sc.nextInt();
        System.out.print("Total marks for each subject: ");
        int mark = sc.nextInt();
        int examTotalMark = n * mark;
        float sum = 0.0f;
        float[] marks = new float[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter "+(i+1)+"th subject marks: ");
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }

        // calculation for each subject must be up to 33%
        float percentageEachSubject = 0.0f;
        for(float num : marks){
            percentageEachSubject = num/mark*100.0f;
            if (percentageEachSubject < 33.0f) {
                System.out.println("He/She is failed this exam!");
                return;
            }
        }

        float percentageTotalMarks = sum/examTotalMark*100.0f;
        if (percentageTotalMarks < 40.0f) {
            System.out.println("He/She is failed this exam!");
        }else{
            System.out.println("He/She is passed the exam!");
        }
    }
}
