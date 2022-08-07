//Get the size of an ArrayList

import java.util.ArrayList;

public class Example_5 {
    public static void main(String[] args) { 
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.size());
    } 
}