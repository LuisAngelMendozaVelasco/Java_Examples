//Read user input

import java.util.Scanner; // import the Scanner class 

public class Example_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        
        // Enter username and press Enter
        System.out.println("Enter username: "); 
        userName = myObj.nextLine();   
           
        System.out.println("\nUsername is: " + userName);        
    }
}