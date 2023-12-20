////////////////////////////
// Loop through a HashMap //
////////////////////////////

import java.util.HashMap;

public class Example_6 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        }
    }
}

/*
key: USA, value: Washington DC
key: Norway, value: Oslo
key: England, value: London
key: Germany, value: Berlin
*/