//Protected attributes

class Person {
    // protected	The code is accessible in the same package and subclasses.
    protected String fname = "Luis";
    protected String lname = "Mendoza";
    protected String email = "luis@mendoza.com";
    protected int age = 27;
}
  
class Example_6 extends Person {
    private int graduationYear = 2018;

    public static void main(String[] args) {
        Example_6 myObj = new Example_6();

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}