package HashTableString;

public class StringClass {

    //Question : remove a / some particular chars from a String
    // Example string input = "student", remove "u and n" -> output:"stdt"

    // initialization
    // i all letters to the left-hand side of i are all processed letter
    // that should not be removed(slow)
    // j is the current index to move. all letters in [i,j] are all area that
    // we  do not care
    public StringBuilder RemoveChar(String input,StringBuilder result){
        if(input.isEmpty()) return result;
        int i = 0;
        int j = 0;

        while(j < input.length()){
            if(input.charAt(j) == 'u'|| input.charAt(j) == 'j') j++;
            else result.setCharAt(i++,input.charAt(j++));
        }

        return result;
    }


    // Remove all leading/ trailing and duplicate empty spaces(only leave one
    // empty space if duplicated spaces happen) from the input string.
    // input= ___abc__ed__ef__
    // output = abc_ed_ef
    // example : (_w1)(_w2)(_w3).....(_wn)
//
//    void RemoveSpace(String s){
//        int slow = 0;
//        int fast = 0;
//        int word_count = 0;
//        while(true){
//            while(fast<s.length()&& s.charAt(fast) == ' '){
//                fast++;
//            }
//            if(fast == s.length()){
//                break;
//            }
//            if(word_count>0){
//                s[slow++] = ' ';
//            }
//            while(fast<s.length() && s[fast] != ' '){
//                s[slow++] = s[fast++];
//            }
//            word_count++;
//        }
//        s.resize(slow)
//    }



//  Remove duplicated and adjacent letters(leave only one letter in each duplicated section) in a string
//  aabb__cc  -> "ab_c"



// char de-duplication adjacent letters repeatedly
//  abbbbacd  -> cd


// sub-string finding
// how to determine whether a string is a substring of another string
// s1 = 'a b c d e' s2= 'c d'
// return the primary index at the s1, return 2
// return -1 if s2 is not in s1



}
