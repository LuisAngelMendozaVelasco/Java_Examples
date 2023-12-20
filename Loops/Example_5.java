//////////////////
// Break a loop //
//////////////////

public class Example_5 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }  
    }
}

/*
Output:

0
1
2
3
*/