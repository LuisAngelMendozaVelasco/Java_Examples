/////////////////////////////////
// Constructor with parameters //
/////////////////////////////////

public class Example_11 {
    int modelYear;
    String modelName;
  
    public Example_11(int year, String name) {
        modelYear = year;
        modelName = name;
    }
  
    public static void main(String[] args) {
        Example_11 myCar = new Example_11(1969, "Mustang");

        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

/*
Output:

1969 Mustang
*/