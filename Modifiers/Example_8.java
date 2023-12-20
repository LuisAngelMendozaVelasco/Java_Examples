//////////////////////////////////////////
// Abstract class with abstract methods //
//////////////////////////////////////////

public class Example_8 {
    public static void main(String[] args) {
        // Create an object of the Student class (which inherits attributes and methods from Person)
        Example_8_Student myObj = new Example_8_Student(); 
        
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // Call abstract method
    }
}

/*
Output:

Name: Luis Mendoza
Email: luis@mendoza.com
Age: 29
Graduation Year: 2018
Studying all day long!
*/