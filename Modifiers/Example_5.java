////////////////////////
// Default attributes //
////////////////////////

public class Example_5 {
    // default	The code is only accessible in the same package. This is used when you don't specify a modifier.
    String fname = "Luis";
    String lname = "Mendoza";
    String email = "luis@mendoza.com";
    int age = 29;
    
    public static void main(String[] args) {
        Example_5 myObj = new Example_5();

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}

/*
Output:

Name: Luis Mendoza
Email: luis@mendoza.com
Age: 29
*/