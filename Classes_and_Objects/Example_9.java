/////////////////////////////////////////
// Access class methods with an object //
/////////////////////////////////////////

public class Example_9 {
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Example_9 myCar = new Example_9();    // Create a myCar object

        myCar.fullThrottle();       // Call the fullThrottle() method
        myCar.speed(200);           // Call the speed() method
    }
}

/*
Output:

The car is going as fast as it can!
Max speed is: 200
*/