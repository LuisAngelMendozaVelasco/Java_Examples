//////////////////////////////////////
// Read user input of various types //
//////////////////////////////////////

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
    
        // String input
        System.out.println("Enter name: ");
        String name = myObj.nextLine();
    
        // Numerical input
        System.out.println("Enter age: ");
        int age = myObj.nextInt();
        System.out.println("Enter salary: ");
        double salary = myObj.nextDouble();
    
        // Output input by user
        System.out.println("\nName: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Salary: " + salary); 
    }
}

/*
Output:

Enter name: 
Luis
Enter age: 
29
Enter salary: 
5000

Name: Luis
Age: 29
Salary: 5000.0
*/