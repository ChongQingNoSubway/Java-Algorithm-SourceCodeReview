package AdString;

public class StringReversal {
    // apple -> elppa

    // base case : when there are 1 or 0 letters remaining i<=j
    // recursive rule:

    void reverse (String[] input, int left, int right){
        if(left <= right){
            return;
        }
        swap(input,left,right);
        reverse(input,left+1,right-1);
    }

    void swap (String[] input, int left, int right){
        String temp = input[left];
        input[left] = input[right];
        input[right] = temp;
    }


    // i love yahoo -> yahoo love i
    // primitive way: Stack|| i love yahoo -> yahoo love i     O(n) space complexity
    //Step1 : reverse each word ->i evol oohya
    // step2 : reverse each sentence yahoo love i


    // abcdef -> efabcd shift the whole string to the right-hand side by two position
    // same as i love yahoo

    //Discussion:
    //1. the idea for "i love yahoo" can be combined to from more complex problem
    // eg. if we have empty/leading/tralling spaces in the input.
    //2. the idea can be extended to other problems as well
    // a eg.String shifting by X chars to the right
    // ab cdef shift to the left by two step
    // step1: reverse each word -> ab cdef -> ba fedc
    // step2: reverse whole String -> cdef ab
}
