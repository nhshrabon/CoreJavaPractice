/*
 * Problem statement:
 *  Write a java program to add two matrix.
 * 
 * Author: Md.Noor Hossain Shrabon
 */

import java.util.Scanner;

public class AddTwoMatrixAlter {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Get matrix dimension from user
        System.out.print("How many rows? ");
        int numRows = sc.nextInt();
        System.out.print("How many coloumns? ");
        int numColoumns = sc.nextInt();

        // Declare and initialize matrix
        int[][] matrixOne = new int[numRows][numColoumns];
        int[][] matrixTwo = new int[numRows][numColoumns];
        int[][] resultMatrix = new int[numRows][numColoumns];

        // Input elements for first elements
        System.out.println("\n ------ Enter First Matrix Elements ------");
        inputMatrixElement(sc, matrixOne, numRows, numColoumns);

        // Input elements for second elements 
        System.out.println("\n ---- Enter Second Matrix Elements ------");
        inputMatrixElement(sc, matrixTwo, numRows, numColoumns);

        // Perform matrix additon operation
        addMatrix(matrixOne, matrixTwo, resultMatrix, numRows, numColoumns);

        // Display the result 
        System.out.println("\n--------- Resultant Matrix (Sum)-------");
        diplayMatrix(resultMatrix, numRows, numColoumns);

        // colsed take input
        sc.close();
    }
    /**
     * Helper method to take input of matrix element
     */
    public static void inputMatrixElement(Scanner sc, int[][] matrix, int rows, int coloumns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coloumns; j++){
                System.out.print("Enter "+(i+1)+" rows and "+(j+1)+" coloumns element: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    /**
     * Helper method to add two matrix elements
     */
    public static void addMatrix(int[][] matrix1, int[][] matrix2, int[][] matrix3, int rows, int coloumns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coloumns; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    /**
     * Helper method to display matrix
     */
    public static void diplayMatrix(int[][] matrix, int rows, int coloumns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coloumns; j++){
                System.out.printf("%d", matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
