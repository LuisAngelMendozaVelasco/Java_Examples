////////////////////////
// Private attributes //
////////////////////////

public class Example_4 {
    // private	The code is only accessible within the declared class
    private String fname = "Luis";
    private String lname = "Mendoza";
    private String email = "luis@mendoza.com";
    private int age = 29;
    
    public static void main(String[] args) {
        Example_4 myObj = new Example_4();

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}


/*
Output:

Name: Luis Mendoza
Email: luis@mendoza.com
Age: 24
*/