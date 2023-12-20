//////////////////////
// Create a HashMap //
//////////////////////

/*
A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values.
*/

import java.util.HashMap;

public class Example_1 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities); 
    }
}

/*
Output:

{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
*/