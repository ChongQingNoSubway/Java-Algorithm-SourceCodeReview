package Bit;

public class bit {

    // Common question
    // 1. Given a number x, how to set x's kth to 1?
    //  ef x =xxxx xxxx and k = 3

    public int solution1(int input,int k){
        int result,temp;
        temp = input<< k;
        result = temp | input;
        return result;
    }

    // 2. Given a number x, how to set x's k-th bit to 0?
    // x = xxxx Yxxx and k =3;
    public int solution2(int input, int k){
        int temp,result;
        temp = input << k;
        temp = ~temp;
        result = temp & input;
        return result;
    }


    // Question 1: determine whether a number x is  a power of 2 (x = 2^n) n>0
    public boolean isPowerOfTwo(int x) {
        if(x<1){
            return false;
        }
        for(int i =x; i > 1; i /= 2){
            if(i%2 != 0){
                return false;
            }
        }
        return true;
    }
    public boolean isPowerOfTwo2(int x){
        return ((x&(x-1)) == 0 && x != 0);
    }


    //Question 2:
    // How to determine the number of bits that are different between two positive integer?
    public int numberOfBits(int x, int y){
        int res = x ^ y;
        int count = 0;
        for(int i = 0; i < 32; i++){
            if(((res >> i) & 1) ==1){
                count++;
            }
        }
        return count;
    }

    //Question3: what happens if we assign a negative number to an unsigned integer?
    // A. compiling error
    // B. nothing happens
    // c. runtime error
    // D. very large integer number that is totally unexpected

    //principle: when we assign a negative number to an unsigned integer
    // the binary-representation does not change, however, we will calculate the value of the unsigned integer by
    // using the current binary representation
    // int  a = -1;


    //Question 4: determine whether a word contains all letters that are unique
    // input = student output = false;
    public boolean isUnique(String word){
        if(word == null) return true;
        for(int i = 0; i < word.length(); i++){
            int pos = word.charAt(i) - 'a';
            int dic = 0;
            if(((dic >> pos) & 1) == 1){
                return false;
            }else{
                dic = dic | ( 1 << pos);
            }
        }
        return true;
    }

    // Follow up: Assumption : not only contain a--z
    //  Contains all ascii codes
    //  256 types of letters to appear in the word
    //  256/32 =  8 integers
    // ASCII code = 88

    // terminology : bit vector
    // int bit_map[8]
    // bit_map[0] == xxxx xxxx xxxx xxxx xxxx 1100 0-31bit
    // .........
    // example 108 bit / 32 = 3.x  position at nth-number of array
    //     108 % 32 = 11 ->position at bit of nth-number

    public boolean isUniqueAD(String word){
        if(word == null) return false;

        int [] dic = new int[8];
        for(int i = 0; i < word.length(); i++){
            int pos = word.charAt(i);
            int posAtArray = pos / 32;
            int posAtBit = pos % 32;
            if(((dic[posAtArray] >> posAtBit) & 1) == 1){
                return false;
            }else{
                dic[posAtArray] = dic[posAtArray] | (1>>posAtBit);
            }
        }
        return true;
    }

    // question5 : how to reverse all bits of a number?
    // 1010 xxxx xxxx 0010 -> 0100 xxxx xxxx 0101
    public int rev(int num) {
        int left = 31;
        int right = 0;
        while(left > right) {
            if(((num>>left)&1) != ((num >> right) & 1)) {
                num = num ^ (1 << left);
                num = num ^ (1 << right);
            }
            left++;
            right++;
        }
        return num;
    }

    // Question6 given a number x, how to get the hexadecimal representation of the number in string type?
    // Eg. 29=> "0x1D" 0x15 vs 15
    public char getHexadecimalDigit(int num) {
        if(num < 10) {
            return (char) (num + '0');
        }else{
            return (char) (num - 10  + 'A');
        }
    }

    public String hexadecimalSwitch(int input){
        if( input == 0 ) {
            return "0";
        }
        boolean negative = false;
        if( input < 0 ){
            negative = true;
            input = Integer.MAX_VALUE + input + 1;
        }

        StringBuilder result = new StringBuilder();
        int index = 0;
        while((!negative && input > 0) || (negative && index < 8)) {
            int digit = input % 16;
            if(negative && index == 7){
                digit = 8 + digit;
            }
            result.append(getHexadecimalDigit(digit));
            input = input / 16;
            index ++;
        }
        return result.reverse().toString();
    }
}
