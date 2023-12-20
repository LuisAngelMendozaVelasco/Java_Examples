///////////////////////////////
// Loop through an ArrayList //
///////////////////////////////

import java.util.ArrayList;

public class Example_6 {
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}

/*
Output:

Volvo
BMW
Ford
Mazda
*/