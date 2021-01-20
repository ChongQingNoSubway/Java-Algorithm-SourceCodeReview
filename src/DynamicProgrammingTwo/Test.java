package DynamicProgrammingTwo;

import java.util.HashSet;

public class Test {

    // Given an array of non-negative integer, you are initially positioned at the
    // first index of the array, Each element in the array represents your maximum jump length at that
    // position. determine if you are able to reach the last index.

    //Given some setup as the jump problem , can you return the minimum number of jumps need to reach
    // the end instead of just whether or not it is possible to reach the end ?


    //  index  0  1  2  3  4
    //      A=[2 ,3 , 1, 1, 4]
    //  1. base case M[n-1] = 0
    //  2. Induction rule
    //          a. M[i] represent the minimum number of jumps need to jump
    //          from the i-th index to the target (n-1)th index
    //          b.M[i] = 1 + min(M[i+j]) where j <= input[i] && j < n
    //  Time = O(n^2) or  O(n*k) where k is the largest number of jumps one can make


    // Question 1 largest sum of a subarray
    //  Given an unsorted array , find the subarray that has the greatest sum, return the sum/
    //  For example: if the input array is {1,2,4,-1,-2,10,-1}, the greatest sum is achieved by subarray{1,2,4,-1,-2,10}


    // Solution :
    //  1.base case: M[0] = input [0]
    //  2. Induction rule : M[i] represents from the [0th element to the i-th element] the largest sum of a subarray ,
    //  including the i-th element
    //   M[i] = M[i-1] + input [i]  if M[i-1] >=0
    //          input[i]        otherwise
    //   Follow up 1: what if we want to optimize the space complexity??
    //   that is easy, just replace M[i] array with a variable, named int previous_value
    //   Follow up 2 : what if we want you to return the start and end indices of the solution array
    //   input2[N] = {1,2,4,-1,-20,10,-1}
    //                start
    //                end
    //      1,we need only two variable, named start and end.
    //
    //
    //      case 1 : when to move start: when we set M[i] = input[i] , which means, we reset the start index when the previous element is negative M[i]
    //      case 2 : when to move end :  end is always == i
    //
    //      How to update the solu_startm and solu_end?
    //      when the global_ max is updated to larger
    //


    // Question 2 : dictionary word problem
    // Given a word , can it composed by concatenating words from a given dictionary? Example: Dictionary
    //  bob
    //  cat
    //  rob

    // word1: bcoabt
    // solution : false

    // word2 : bobcatrob
    // solution : true

    // solution :
    // 1.Base case：
    // 2. Induction rule

    public boolean wordsolver(String word, HashSet<String> dict) {
        boolean [] M = new boolean[word.length()+1];
        for(int i = 1; i <= word.length(); i++) {
            if(dict.contains(word.substring(0,i))) {
                M[i] = true;
                continue;
            }
            for(int j = 1; j<i; j++){
                if(M[j] && dict.contains(word.substring(j,i))){
                    M[i] = true;
                    break;
                }
            }
        }
        return M[word.length()];
    }

    //Question3 : Given two string of alphanumeric characters, determine the minimum number of Replace,
    // Delete, and Insert operations needed to transform one string into the other.
}
    // Example:
    // s1 = "asdf"
    // s2 = "sfhj"

    // s1 == c1 | s1r  <- rest of s1
    // s2 == c2 | s2r  <- rest of s2

