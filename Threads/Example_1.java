//Running a thread by extending the thread class

/*Threads allows a program to operate more efficiently by doing multiple things at the same time.
Threads can be used to perform complicated tasks in the background without interrupting the main program.
It can be created by extending the Thread class and overriding its run() method*/

public class Example_1 extends Thread{
    public static void main(String[] args) {
        Example_1 thread = new Example_1();

        thread.start(); // Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}