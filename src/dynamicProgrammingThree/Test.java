package dynamicProgrammingThree;

public class Test {

    // Question0 : Largest sum of a subarray

    public int FindLargestSubarray(int[] array) {
        if(array == null || array.length == 0) {
            //throw IllegalStateException
        }else{
            return array[0];
        }

        int left = 0;
        int sol_left = 0;
        int sol_right = 0;
        int global_max = Integer.MIN_VALUE;
        int [] M = new int[array.length];
        M[0] = array[0];

        for(int right = 1; right < array.length; right++) {
            if(M[right-1] < 0) {
                M[right] = array[right];
                left = right;
            }else{
                M[right] = M[right-1] + array[right];
            }

            if(M[right] > global_max) {
                global_max = M[right];
                sol_left = left;
                sol_right = right;
            }
        }
            return global_max;
    }


    // Question1  an unsorted array longest continuous 1 question
    //  Solution:
    //          1.base case :  M[0] = input[0] only 1 element in the input
    //          2.Induction rule :  M[i] represents [from the 0-th element to the i-th element]
    //            the longest contiguous 1sm (including the i-th element.)
    //                          M[i] = 1 + M[i-1] if input[i] ==1
    //                                      0      otherwise

    //Question 2a. Given a Matrix that contains only 1s and 0s, how to find the largest cross with the
    // same arm lengths and the two arms join at the central point of each other.

    // same as question 1 , but we need to scan array from four directions(using the question 1 method), finally
    // we finally iterate over all possible coordinate[x][y], and take the min (direction 1 ....derection 4[x][y])

    //Question 2b.  same as question2a , but we need to find the largest "x"
    // solution : almost the same as Question2a, form four directions , left-top -> right-bottom

    //Question 3a. Given a matrix where every element is either 0s and 1s, find the largest subsquare surrounded by '1'.
    // Step 1: pre-processing for direction (right to left) to get the longest contiguous 1s
    // Step 2: pre-processing for direction (bottom up) to get the longest contiguous 1s
    // Step 3: for each x, y coordinate as the top-left corner
    //          for all possible edge length(n,n-1....)

    //Question3b. Given a bunch of matches , try to find the largest square


    //Question 4: Given a integer array A[N], there are repeated queries asking for the sum
    // between A[i] and A[j] , then what should we do in order to speed up queries?

    // A[8] = {3,2,1,4,5,3,2,6}
    // Solution 1 : Path-Prefix problem
    // PathPrefixSum[8] = 3 5 6 10  15 18 20 26
    // Sum [3][7] = PathPrefixSum[7] - PathPrefix[3] + input [3]

    //Question 5 : Given a Matrix of integer(positive & negative numbers & 0s) , how to find the sub-matrix with largest sum?
    // input :
    //   0 x x x x x
    //   x x x x x x
    //   x x X x Z x
    //   x x x W x Y
    //   X X X X X X

    // Question0 : how many sub-matrix are there in the input matrix?? size = n * n
    //            Time = O(n^4)

    // solution (O(n^5)) : Calculate the Prefix-sum in 1D, and then we can calculate the sum on each row in O(1) time, thus, the total time to calculate one possible matrix is O(n)
    // Totally , there are n^4 matrix, the total time = O(n^5)

    // AD-Solution : use 2D pre-fix sum O(n^4)
    // SUM[i][j] - [t][k] = [0][0] - [t][k] -- [0][0]-[i-1][k] -- [0][0][t][j-1] + [0][0][i-1][j-1]

    // Step 1:
    // how to store prefixsum
    // example :             prefix
    //  1 2 3 4 5            1 3  6  10  15
    //  1 2 1 2 1            2 6 10  16  22
    //  2 1 3 1 2

    // Step2: for i
    //          for j
    //              for k
    //                  for t
    //                      SUM[i][j] - [t][k] = [0][0] - [t][k] -- [0][0]-[i-1][k] -- [0][0][t][j-1] + [0][0][i-1][j-1]
    //              }
    //                  }
    //                      }
    // total Time = O(n^4)
}
