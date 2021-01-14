package AdString;

import java.util.*;

public class advanceTopic {
    //Advanced Topic
    // shuffling eg. ABCD1234 -> A1B2C3D4
    // Permutation: (use DFS)
    // decoding/encoding aaaabccc -> a4b1c2
    // sliding windows using slow/fast pointers



    //1.String shuffling
    // 1.A1B2C3D4E5 -> ABCDE12345 mege-sort
    // 1.2 and direction: 'abcde12345' -> 'a1b2c3d4e5'
    // size = 14
    // mid = left + size/2 = 7
    // leftmid = left + (1/4)*size = 3
    // rightmid = left + (3/4) *size = 10

    void convert(char a[],int left, int right){
        if(left - right <=1){
            return;
        }
        int size = right-left+1;
        int mid = left+ size/2;
        int leftmid = left + size/4;
        int rightmid = left+ size*3/4;
        reverse(a,leftmid,mid-1);
        reverse(a,mid,rightmid-1);
        reverse(a,leftmid,rightmid-1);

        convert(a,left,left+2*(leftmid-left)-1);
        convert(a,left+2(leftmid-left), right);
    }

    //2.String permutation (DFS)
    // abc
    // q1: no duplicate letter in input string.
    // q2; have duplicate letters in input string.

    public void permutation(char[] c, int index){
        if(index == c.length){
            System.out.println(c);
            return;
        }
        HashSet<Character> st = new HashSet<Character>();
        for(int i = index; i< c.length; i++){
            if(!st.contains(c[i])){
                st.add(c[i]);
                swap(c,index,i);
                permutation(c,index+1);
                swap(c,index,i);
            }
        }
    }


    // 3.String En/ Decoding "aaaabccaaaa" -> "a4b1c2a5"
    // step1 : from left to right, we only deal with the pattern that become shorter,
    // and in the meantime, we count how many times only 1 copy of letter occurred in the string
    // Step2: from right to left, do the same thing do the copy...



    //4.sliding window in a string
    // Q4.1: longest substring that contains only unique char
    // given a string , return the length of the longest substring without duplicate characters.
    // For example, the longest substrings without repeating characters for 'BDEFGADE' are 'BDEFGA', WHOSE size is 6
    //
    //
    // critical point for review: we must maintain a hashtable that reflects the real-time information
    //  about the elements within the sliding window:
    //  when we move the R border, we add information to the hash_table
    //  when we move the L border, we delete information from the hash_table.
    //
    //
    // solution: use two pointers slows and fast
    //            slow: the begin index if the a solution
    //
    public String[] findLongest(String [] input) {
        Hashtable<String,Integer> my_map = new Hashtable<>();
        int s = 0;
        int max = 0;
        int start, end;
        for(int f = 0 ; f < input.length; ++f){
            my_map.put([input[f]],);
            if(my_map[input[f]]>1){
                while(my_map[input[f]]>1){
                    my_map[input[s]]--;
                    s++;
                }
            }else{
                if(f-s+1>max){
                    max = f -s + 1;
                    start = s;
                    end = f;
                }
            }
        }
        return input.substr(start,end-start+1);
    }


    //Find all anagrams  of a substring s2 in a long string s1
    // string s2 = "aabc"
    // string s1 = "zzzz cde bcaa b cyywwwww"
    // sliding window idea:
    // s2's information
    //
    // zzzzcdebcaabcyywwwww
    //       s____f
    // from right to left , when type_of_letters_to_match = 0
    //  we return the result from [s,f]
    //<a,0>
    //<b,0>
    //<c,0>      type_of_letters_to_match = 0
    // solution [7,10]
    // time o(n)



    // 4.3 Given  a 0-1 array you can flip at most k '0's to '1's,
    // please find the longest subarray that consists of all '1s'
    // 0101001010001101010100110111010
    //    _______
    // solution : find a sliding window that contains at most k zeros
    // when to move the right border： when the counter_of_zero <= k
    // when to move the left border: when the counter_of_zero >k

    public int longestOnes(int[] A, int k){
        int fast, result = 0, slow = 0, counter_zero = 0;
        for(fast = 0; fast<A.length; fast++)
        {
            if(A[fast] == 0) counter_zero++;
            if(counter_zero > k){
                if(A[slow] == 0) counter_zero--;
                slow++;
            }
            result = Math.max(result,fast-slow+1);
        }
        return result;
    }

}
