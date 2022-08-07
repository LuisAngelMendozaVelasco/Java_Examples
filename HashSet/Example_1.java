//Create a HashSet and add items to it

//A HashSet is a collection of items where every item is unique

// Import the HashSet class
import java.util.HashSet;

public class Example_1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
}