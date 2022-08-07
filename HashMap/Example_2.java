//Access an item in a HashMap

import java.util.HashMap;

public class Example_2 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("England"));
    }
}