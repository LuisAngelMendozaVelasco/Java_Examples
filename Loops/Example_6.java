/////////////////////
// Continue a loop //
/////////////////////

public class Example_6 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 4) {
                continue;
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
5
6
7
8
9
*/