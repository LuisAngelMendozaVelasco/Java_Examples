////////////////////////////////
// Avoid concurrency problems //
////////////////////////////////

/*
To avoid concurrency problems, it is best to share as few attributes between threads as possible. 
If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has 
finished running before using any attributes that the thread can change.
*/

public class Example_4 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Example_4 thread = new Example_4();

        thread.start();

        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }

        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }
}

/*
Output:

Waiting...
Main: 1
Main: 2
*/