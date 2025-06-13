import java.util.Scanner;

/**
 * Problem statement:
 *  Writhe a java program to use constructor to set radius and height of a cylinder
 * 
 * Author: Md.Noor Hossain Shrabon
 */
public class CylinderUsingConstructor {
    private int radius;
    private int height;

    CylinderUsingConstructor(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        int r = sc.nextInt();
        System.out.print("Enter height of cylinder: ");
        int h = sc.nextInt();
        CylinderUsingConstructor myCylinder = new CylinderUsingConstructor(r, h);

        // Print radius and height
        System.out.println("Radius of the cylinder is "+myCylinder.radius);
        System.out.println("Height of the cylinder is "+myCylinder.height);

    }
}
