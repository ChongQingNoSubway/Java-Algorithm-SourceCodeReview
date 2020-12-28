package Algorithm;


import java.util.Stack;

// Given a string containing just the characters '(' , ')', '{', '}' and '[' , ']'
// determine if the input String is valid
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// Example () true  [] true  []{} true

public class ValidParentheses {
        public static boolean isValid(String s) {
            Stack<String> myStack  =  new Stack<String>();
            for (int i=0;i<s.length();i++)
            {
                String x = s.substring(i,i+1);
                if(x.equals(")") ){
                    if(myStack.empty() || !myStack.peek().equals("(")) {
                        return false;
                    }
                    myStack.pop();
                }

                else if(x.equals("}") ){
                    if(myStack.empty() || !myStack.peek().equals("{")) {
                        return false;
                    }
                    myStack.pop();
                }

                else if(x.equals("]") ){
                    if(myStack.empty() || !myStack.peek().equals("[")) {
                        return false;
                    }
                    myStack.pop();
                }
                else myStack.push(x);
            }
            return myStack.empty();
        }

        public static void main(String[] args){
            ValidParentheses valid = new ValidParentheses();
            String myString = "{((}";
            boolean result = ValidParentheses.isValid(myString);
            System.out.println(result);
        }
}
