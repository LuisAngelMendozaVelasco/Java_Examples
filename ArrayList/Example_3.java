//////////////////////////////////////
// Remove an item from an ArrayList //
//////////////////////////////////////

import java.util.ArrayList;

public class Example_3 {
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0);
        System.out.println(cars);
    } 
}

/*
Output:

[BMW, Ford, Mazda]
*/