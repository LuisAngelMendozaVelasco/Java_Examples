/////////////////////////////////////////////////////////////
// Running a thread by implementing the Runnable interface //
/////////////////////////////////////////////////////////////

public class Example_2 implements Runnable {
    public static void main(String[] args) {
        Example_2 obj = new Example_2();
        Thread thread = new Thread(obj);
        
        thread.start();
        System.out.println("This code is outside of the thread.");
    }

    public void run() {
        System.out.println("This code is running in a thread.");
    }
}

/*
Output:

This code is outside of the thread.
This code is running in a thread.
*/