/*
 * Problem statements:
 *  Write a java program to reverse an array.
 * 
 * Author: Md.Noor Hossain Shrabon
 */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // Create scanner object
        Scanner sc = new Scanner(System.in);
        // Input array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        // Declaration and Initialization
        int[] arra = new int[size];
        
        // Input array elements
        System.out.println("\n ----- Enter Arrays Elements --------");
        for(int i = 0; i < size; i++){
            System.out.print("Enter "+(i+1)+" th element: ");
            arra[i] = sc.nextInt();
        }
 
        // Reversing array by sweaping elements first to last sequently
        for(int i = 0; i < size/2; i++){
            int temp = arra[i];
            arra[i] = arra[size-i-1];
            arra[size-i-1] = temp;
        }

        // Display reversed array
        System.out.println("Reversed Array : "+Arrays.toString(arra));

    }
}
