/**
 * Problem statement:
 *  Write a java program to Create a class Square with a method to initialize its side, calculating area, perimeter etc.
 * 
 * Author: Md.Noor Hossain Shrabon
 */

class Square {
    int side;

    // Create method to initialize side
    public void setSide(int n){
        this.side = n;
    }

    // Create method to calculating area
    public int calculatingArea(int n){
        return n*n;
    }

    // Create method to claculate perimeter
    public int calculatingPeremeter(int n){
        return 4*n;
    }
    
 }
public class CustomaizeClassSquar {
    public static void main(String[] args) {
        // Create Square class object
        Square sqr = new Square();
        // Call method to initialize side
        sqr.setSide(5);
        // Call method to calculate area
        System.out.println(sqr.calculatingArea(5));
        // Call method to calculate peremeter
        System.out.println(sqr.calculatingPeremeter(5));
    }
}
