//Import a class from the Java API

/*A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
    Built-in Packages (packages from the Java API)
    User-defined Packages (create your own packages)*/

import java.util.Scanner; // import the Scanner class 

public class Example_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        
        // Enter username and press Enter
        System.out.println("Enter username:"); 
        userName = myObj.nextLine();   
           
        System.out.println("\nUsername is: " + userName);        
    }
}