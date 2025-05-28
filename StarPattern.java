/*
 * Problem Statement:
 *  Write a java program to display a pattern of star(*) where sequently dicrease star per row/line
 * 
 * Author: Md.Noor Hossain Shrabon
 */
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Maximum star(*) : ");
        int numStart = sc.nextInt();
        System.out.print("How many row: ");
        int numRow = sc.nextInt();

        for(int i = numRow; i >0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        
    }
}
