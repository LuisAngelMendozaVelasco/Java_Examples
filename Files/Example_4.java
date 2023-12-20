//////////////////////////
// Get file information //
//////////////////////////

import java.io.File; 
import java.io.IOException;

public class Example_4 {
    public static void main(String[] args) {  
        File myObj = new File("filename.txt"); 
        try {  
            myObj.createNewFile();
        } 
        catch(IOException e) {
            e.printStackTrace(); // Prints this throwable and its backtrace to the standard error stream.
        }  

        if(myObj.exists()) {
            System.out.println("File name: " + myObj.getName()); 
            System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
            System.out.println("Writeable: " + myObj.canWrite()); 
            System.out.println("Readable: " + myObj.canRead()); 
            System.out.println("File size in bytes: " + myObj.length());
            myObj.delete();
        } 
        else {
            System.out.println("The file does not exist.");
        }
    } 
}

/*
Output:

File name: filename.txt
Absolute path: /home/luis-mendoza/Documents/GitHub/Java_Examples/Files/filename.txt
Writeable: true
Readable: true
File size in bytes: 0
*/