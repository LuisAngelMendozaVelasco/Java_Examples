/////////////////
// Read a file //
/////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {  
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);  

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } 
        catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
    }  
}

/*
Output:

An error occurred.
java.io.FileNotFoundException: filename.txt (No such file or directory)
*/