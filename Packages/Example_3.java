//Create a package

/*To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:
Example
└── root
  └── mypack
    └── MyPackageClass.java
To create a package, use the package keyword*/

package Packages;

public class Example_3 {
    public static void main(String[] args) { 
        System.out.println("This is my package!"); 
    } 
}

/*Save the file as MyPackageClass.java, and compile it:
    C:\Users\Your Name>javac MyPackageClass.java
Then compile the package:
    C:\Users\Your Name>javac -d . MyPackageClass.java
This forces the compiler to create the "mypack" package.
The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, 
if you want to keep the package within the same directory, you can use the dot sign ".".
Note: The package name should be written in lower case to avoid conflict with class names.*/