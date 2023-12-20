////////////////////////////////////////
// Remove all items from an ArrayList //
////////////////////////////////////////

import java.util.ArrayList;

public class Example_4 {
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.clear();
        System.out.println(cars);
    } 
}

/*
Output:

[]
*/