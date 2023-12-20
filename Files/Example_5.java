///////////////////
// Delete a file //
///////////////////

import java.io.File;
import java.io.IOException; 

public class Example_5 {
    public static void main(String[] args) { 
        File myObj = new File("filename.txt"); 
        try {  
            myObj.createNewFile();
        } 
        catch(IOException e) {
            e.printStackTrace(); // Prints this throwable and its backtrace to the standard error stream
        }  

        if(myObj.delete()) { // To delete a file in Java, use the delete() method
            System.out.println("Deleted the file: " + myObj.getName());
        } 
        else {
            System.out.println("Failed to delete the file.");
        } 
    } 
}

/*
Output:

Deleted the file: filename.txt
*/