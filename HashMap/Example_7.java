///////////////////////////////////////////////////////////////////////
// Create a HashMap that should store String keys and Integer values //
///////////////////////////////////////////////////////////////////////

// Import the HashMap class
import java.util.HashMap;

public class Example_7 {
    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();
    
        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        for (String i : people.keySet()) {
            System.out.println("Name: " + i + ", Age: " + people.get(i));
        }
    }
}

/*
Name: Angie Age: 33
Name: Steve Age: 30
Name: John Age: 32
*/