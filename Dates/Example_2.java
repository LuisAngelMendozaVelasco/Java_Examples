//////////////////////////
// Display current time //
//////////////////////////

import java.time.LocalTime;  // Import the LocalTime class

public class Example_2 {
    public static void main(String[] args) {  
        LocalTime myObj = LocalTime.now();

        System.out.println(myObj);
    } 
}

/*
Output:

14:58:05.824755
*/