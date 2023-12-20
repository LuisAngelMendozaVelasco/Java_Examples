//////////////////////////
// Display current date //
//////////////////////////

import java.time.LocalDate;  // Import the LocalDate class

public class Example_1 {
    public static void main(String[] args) {  
        LocalDate myObj = LocalDate.now();  // Create a date object
        System.out.println(myObj);  // Display the current date
    }  
}

/*
Output:

2023-12-20
*/