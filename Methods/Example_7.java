////////////////////////
// Method overloading //
////////////////////////

public class Example_7 {
    static int plusMethod(int x, int y) {
        return x + y;
    }
    
    static double plusMethod(double x, double y) {
        return x + y;
    }
    
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);

        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    } 
}

/*
Output:

int: 13
double: 10.559999999999999
*/