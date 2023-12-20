////////////////////////////
// Loop through a HashSet //
////////////////////////////

// Import the HashSet class
import java.util.HashSet;

public class Example_6 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        for(String i : cars) {
            System.out.println(i);
        }
    }
}

/*
Output:

Volvo
Mazda
Ford
BMW
*/