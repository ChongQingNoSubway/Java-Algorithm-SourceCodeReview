package Algorithm;

//Given two non-negative integer num1 and num2 represented as strings. return the product of
// num1 and num2, also represented as a string

// Input num1 = "2" num2="3" Output = "6"

import java.util.Vector;

public class MutiplyString {
    public String multiply(String num1, String num2){
        if(num1.equals("0")|| num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int [] product = new int[len1+len2];

        for(int i = len1-1;i>=0;i--){
            for(int j = len2-1; j>=0;j--){
                int multiple = (num1.charAt(i) - '0') * (num2.charAt(j) -'0');
                int sum = product[i+j+1] + multiple;

                product[i+j+1] = (sum)%10;
                product[i+j] += sum/10;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i : product){
            result.append(i);
        }
        return result.toString();
    }
}
