///////////////////////////////////
// Display current date and time //
///////////////////////////////////

import java.time.LocalDateTime;  // Import the LocalDateTime class

public class Example_3 {
    public static void main(String[] args) {  
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
    }
}

/*
Output:

2023-12-20T14:58:05.824755
*/