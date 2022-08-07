//Display current date and time

import java.time.LocalDateTime;  // import the LocalDateTime class

public class Example_3 {
    public static void main(String[] args) {  
        LocalDateTime myObj = LocalDateTime.now();
        
        System.out.println(myObj);
    }
}