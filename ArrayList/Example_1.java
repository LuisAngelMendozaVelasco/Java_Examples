/////////////////////////
// Create an ArrayList //
/////////////////////////

/*
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, 
you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.
*/

import java.util.ArrayList;

public class Example_1 {
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    } 
}

/*
Output:

[Volvo, BMW, Ford, Mazda]
*/