//////////////////////
// Java inheritance //
//////////////////////

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
  
class Example_1 extends Vehicle {
    private String modelName = "Mustang";
    
    public static void main(String[] args) {
        Example_1 myFastCar = new Example_1();
        
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}

/*
Output:

Tuut, tuut!
Ford Mustang
*/