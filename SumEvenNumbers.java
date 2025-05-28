/*
 * Problem Statement:
 *  Write a java program to sum first n even/odd numbers using do while loop.
 * 
 * Author: Md.Noor Hossain Shrabon
 */

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to summing you want? ");
        int num = sc.nextInt();

        // Calculating using do while loop
        int sum = 0;
        int i = 0;
        do{
            sum += 2*i;
            i++;
        }while(i < num);

        System.out.printf("Sum of first %d even numbers is %d",num,sum);
        System.out.println();
    }
}
