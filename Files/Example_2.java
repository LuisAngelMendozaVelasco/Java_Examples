//Write to a file

/*We use the FileWriter class together with its write() method to write some text to a previous created file. 
Note that when you are done writing to the file, you should close it with the close() method*/

import java.io.FileWriter;
import java.io.IOException;

public class Example_2 {
    public static void main(String[] args) {  
        try {  
            FileWriter myWriter = new FileWriter("filename.txt");

            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } 
        catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
    } 
}