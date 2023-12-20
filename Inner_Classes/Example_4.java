/////////////////////////////////////////
// Access outer class from inner class //
/////////////////////////////////////////

// One advantage of inner classes, is that they can access attributes and methods of the outer class.

class OuterClass {
    int x = 10; 
  
    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Example_4 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myInner.myInnerMethod());
    }
}

/*
Output:

10
*/