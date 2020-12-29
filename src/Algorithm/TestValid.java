package Algorithm;

public class TestValid {
    public static void main(String[] args){
        ValidParentheses valid = new ValidParentheses();
        String myString = "{((}";
        boolean result = valid.isValid(myString);
        System.out.println(result);
    }
}
