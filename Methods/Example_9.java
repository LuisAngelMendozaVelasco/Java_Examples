/////////////////////////////////////////////////
// Recursive function with a halting condition //
/////////////////////////////////////////////////

/*
Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. 
Infinite recursion is when the function never stops calling itself. 
Every recursive function should have a halting condition, which is the condition where the function stops calling itself. 
In this example, the function adds a range of numbers between a start and an end. The halting condition for this recursive function is when end is not greater than start.
*/

public class Example_9 {
    public static void main(String[] args) {
        int result = sum(5, 10);

        System.out.println(result);
    }
    
    public static int sum(int start, int end) {
        if(end > start) {
            return end + sum(start, end - 1);
        } 
        else {
            return end;
        }
    }
}

/*
Output:

45
*/