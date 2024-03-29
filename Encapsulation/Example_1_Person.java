/*
The get method returns the variable value, and the set method sets the value.
Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case.
*/

public class Example_1_Person {
    private String name;

    // Getter
    public String getName() {
        return name;
    }
 
    // Setter
    public void setName(String newName) {
        this.name = newName; // The this keyword is used to refer to the current object.
    }
}

/*
Why Encapsulation?
- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data
*/