////////////////////////////////////////
// Import a package from the Java API //
////////////////////////////////////////

import java.util.*; // Import the java.util package 

public class Example_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        
        // Enter username and press Enter
        System.out.println("Enter username:"); 
        userName = myObj.nextLine();   
           
        System.out.println("\nUsername is: " + userName);        
    }
}

/*
Output:

Enter username:
Luis

Username is: Luis
*/