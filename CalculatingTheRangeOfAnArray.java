/*
 * Problem statement:
 *  Write a java program to calculate range of marks from an array which contain student marks of physics marks.
 * 
 * Author: Md.Noor Hossain Shrabon
 */

import java.util.Arrays;
import java.util.Scanner;

public class CalculatingTheRangeOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many student? ");
        int numStudent = sc.nextInt();
        float[] marks = new float[numStudent];
        // Input array form user
        for(int i = 0; i < numStudent; i++){
            System.out.print("Enter "+(i+1)+" student marks: ");
            marks[i] = sc.nextFloat();
        }
        Arrays.sort(marks);
        float lowerMark = marks[0];
        float upperMark = marks[marks.length-1];
        System.out.println("Array range is "+lowerMark+" to "+upperMark);
    }
}
