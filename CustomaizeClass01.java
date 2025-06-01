/**
 * Problem statement:
 *  Write a java program to Create a customize class cellPhone with methods to print
 *  "ringing..." "Vibrating..." etc.
 * 
 * Author:Md.Noor Hossain Shrabon
 */
class cellPhone {

    // Create method
    public void ringing(){
        System.out.println("Cell phone ringing ......");
    }

    public void Vibrating(){
        System.out.println("Cell phone vibrating.......");
    }
    
}
public class CustomaizeClass01 {
    public static void main(String[] args) {
        // Create cellPhone class object
        cellPhone cPhone = new cellPhone();

        // Call methods
        cPhone.ringing();
        cPhone.Vibrating();
    }
}
