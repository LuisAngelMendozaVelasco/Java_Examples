//Encapsulation (getters and setters)

/*The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable*/

public class Example_1 {
    public static void main(String[] args) {
        Example_1_Person myObj = new Example_1_Person();

        myObj.setName("Luis");
        System.out.println(myObj.getName());
    }
}