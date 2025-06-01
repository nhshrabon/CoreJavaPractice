/**
 * Problem statement:
 *  Write a java program to create a class Employee with following properties and methods:
 *      (i) Salary (property)(int).
 *      (ii) getSalary (method returning int)
 *      (iii) name (property)(String)
 *      (iv) getName (method returning String)
 *      (v) setName (method changing name)
 * 
 * Author: Md. Noor Hossain Shrabon
 */

class Employee {
    
    String name;
    int salary;

    // Create salary method
    public int getSalary(){
        return salary;
    }

    // Create get name method
    public String getName(){
        return name;
    }

    // Create change name method
    public void setName(String name){
        this.name = name;
    }
    
}


public class CustomaizeClass {
    
    public static void main(String[] args) {
        // Create object of Employee class
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        // Initialize property
        employee1.name = "Mahfuj";
        employee1.salary = 34000;

        // Call Methods
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
        employee1.setName("Mehdi Hasan");
        System.out.println(employee1.getName());

        // Set properties using second object
        employee2.name = "Riton";
        employee2.salary = 120000;

        // Call methods
        System.out.println(employee2.getName());
        System.out.println(employee2.getSalary());
        employee2.setName("Imtiaz Ahmed");
        System.out.println(employee2.getName());

        // Set properties using third object
        employee3.name = "Hridoy";
        employee3.salary = 55000;

        // Call methods
        System.out.println(employee3.getName());
        System.out.println(employee3.getSalary());
        employee3.setName("Labib");
        System.out.println(employee3.getName());

    }
}
