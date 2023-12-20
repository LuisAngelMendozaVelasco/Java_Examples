//////////////////////////////
// Formatting date and time //
//////////////////////////////

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class Example_4 {
    public static void main(String[] args) {  
        LocalDateTime myDateObj = LocalDateTime.now();  

        System.out.println("Before formatting: " + myDateObj);  

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formattedDate = myDateObj.format(myFormatObj);  

        System.out.println("After formatting: " + formattedDate);  
    }  
}

/*
Output:

Before formatting: 2023-12-20T14:58:05.824755
After formatting: 2023-12-20 14:58:05
*/