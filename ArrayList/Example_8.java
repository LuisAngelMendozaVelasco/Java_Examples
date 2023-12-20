//////////////////////////////////////////////////////////////
// Create an ArrayList that should store numbers (integers) //
//////////////////////////////////////////////////////////////

import java.util.ArrayList;

public class Example_8 {
    public static void main(String[] args) { 
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    } 
}

/*

Output:

10
15
20
25
*/