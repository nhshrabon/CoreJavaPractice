import java.util.Scanner;

/**
 * Problem statement:
 *  (i)Create a class Cylinder and use getter and setters to set its radius and height
 *  (ii) Use (i) to calculate surface area and volumn of the cylinder
 * 
 * Author: Md.Noor Hossain Shrabon
 */

public class Cylinder {
    private int radius;
    private int height;
    
    // Create getter and setter for radius and height
    public void setRadius(int r){
        this.radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return height;
    }

    /** 
     * Helper method to calculate surface area and volumn of the cylinder
     */
    public double calculateSurfaceArea(int r, int h){
        double suraceArea = 2*3.1416*r*(r+h);
        return suraceArea;
    }

    public double caculateVolumn(double r, int h){
        double volume = 3.1416*r*r*h;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create Cylinder object
        Cylinder mCylinder = new Cylinder();
        // Take input from user using setter
        System.out.print("Enter radius of the cylinder: ");
        mCylinder.setRadius(sc.nextInt());
        System.out.print("Enter height of the cylinder: ");
        mCylinder.setHeight(sc.nextInt());
        //Print output
        System.out.println("The radius of the cylinder is "+mCylinder.getRadius());
        System.out.println("The height of the cylinder is "+mCylinder.getHeight());

        // Calculate surfaceArea and Volume by using methods
        double area = mCylinder.calculateSurfaceArea(mCylinder.getRadius(), mCylinder.getHeight());
        double volume = mCylinder.caculateVolumn(mCylinder.getRadius(), mCylinder.getHeight());

        // print surfaceArea and volume
        System.out.println("The surface area of the cylinder is "+area);
        System.out.println("The volume of the cylinder is "+volume);
    }
}
