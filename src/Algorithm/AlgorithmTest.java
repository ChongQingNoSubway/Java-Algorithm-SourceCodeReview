package Algorithm;

public class AlgorithmTest {
    public static void main(String[] args){
        ValidParentheses valid = new ValidParentheses();
        String myString = "{((}";
        boolean result = valid.isValid(myString);
        System.out.println(result);


        MutiplyString muti = new MutiplyString();
        String num1 = "2";
        String num2 = "717";
        String result2 = muti.multiply(num1,num2);
        System.out.println(result2);
    }
}
