/////////////////////////////////////////////
// Loop through an ArrayList with for-each //
/////////////////////////////////////////////

import java.util.ArrayList;

public class Example_7 {
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for(String i : cars) {
            System.out.println(i);
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