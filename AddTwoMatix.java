/*
 * Problem statement:
 *  Write a java program to add two matrix.
 * 
 * Author: Md.Noor Hossain Shrabon
 */

import java.util.Scanner;

public class AddTwoMatix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int numRows = sc.nextInt();
        System.out.print("How many coloumns? ");
        int numColoumns = sc.nextInt();
        int[][] matrixOne = new int[numRows][numColoumns];
        int[][] matrixTwo = new int[numRows][numColoumns];
        System.out.println("\n---- Input First Matrix----");
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numColoumns; j++){
                System.out.print((i+1)+" rows "+(j+1)+" coloumn element: ");
                matrixOne[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n---- Input Second Matrix -----");
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numColoumns; j++){
                System.out.print((i+1)+" rows "+(j+1)+" coloumn element: ");
                matrixTwo[i][j] = sc.nextInt();
            }
        }

        // Additon of two matrix
        int[][] resMatrix = new int[numRows][numColoumns];
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numColoumns; j++){
                resMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        // Display result matrix
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numColoumns; j++){
                System.out.print(resMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
