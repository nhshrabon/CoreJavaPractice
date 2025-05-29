/*
 * Problem statement:
 *  Write a java program to find out whatever a given number is present in an array or not.
 * 
 * Author: Md.Noor Hossain Shrabon
 */

import java.util.Scanner;

public class DetectAnElementIsPresentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many element you want for this array: ");
        int num = sc.nextInt();
        int[] numbers = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("Enter "+(i+1)+" number: ");
            numbers[i] = sc.nextInt();
        }
        // input search number
        System.out.print("Enter searching number: ");
        int searchNumber = sc.nextInt();

        boolean isPresent = false;
        // searching using for-each loop
        for(int element:numbers){
            if (element == searchNumber) {
                isPresent = true;
                break;
            }
        }

        // display result
        System.out.println(isPresent ? "The number is present in the array.":"The number is not present in the array.");
    }
}
