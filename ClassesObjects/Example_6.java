//Multiple attributes

public class Example_6 {
    String fname = "Luis";
    String lname = "Mendoza";
    int age = 27;
  
    public static void main(String[] args) {
        Example_6 myObj = new Example_6();

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}