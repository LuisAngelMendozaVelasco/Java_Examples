///////////////////////////////////////////////////////
// Create a HashSet that should store Integer values //
///////////////////////////////////////////////////////

// Import the HashSet class
import java.util.HashSet;

public class Example_7 {
    public static void main(String[] args) {
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
    
        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
    
        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } 
            else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}

/*
Output:

1 was not found in the set.
2 was not found in the set.
3 was not found in the set.
4 was found in the set.
5 was not found in the set.
6 was not found in the set.
7 was found in the set.
8 was found in the set.
9 was not found in the set.
10 was not found in the set.
*/