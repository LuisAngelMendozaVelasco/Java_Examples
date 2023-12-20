/////////////////////////////////////////
// Loop through an array with for-each //
/////////////////////////////////////////

public class Example_6 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

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