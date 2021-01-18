package DynamicProgramming;

public class AlgorithmLearning {


// Longest Ascending subarray
// given an unsorted array, find the length of the longest subarray in which the numbers are in
// ascending order. For example: if the input array is {7,2,3,1,5,8,9,6}, the subarray with the most
// numbers in ascending order is {1,5,8,9} and the expected output is 4

// Concept:
// sub-array: contiguous elements in an array
// sub-sequence: not necessarily contiguous, eg 2,5,6
//
// 1. bases case M[0] = 1, because there is only one element as the based case
// 2. induction rule: M[i] represents [from the 0-th element to i-th element], the longest ascending subarray
// , (including the ith element)
//  M[i] = M[i] -1      if input[i-1] < input[i]
//          1           else
// solution
//  input = {7,2,3,1,5,8,9,6}
//  M[i] =   1,1,2,1,2,3,4,1

//  Maximal product when cutting rOPE
//  Given a rope with integer-length n , how to cut the rope into m integer-length parts with length P[0], p[1],
//  in order to get the maximal product of p[0]*p[1]*..*p[m-1]? m is
//  determined by you and must be greater than 0;

//  solution :
//  1.base case : smallest rope length = 1m  M[1] = ??
//  2.induction rule:
//  input =
//  M[i] represents maximal product of a rope with i-meter long ( at least one cut must be made)
//   size = 1m    - >  M[1] = 1 or 0
//   size = 2m    - >  M[2] = max(1,M[1]) * max(1,M[1])
//   size = 3m    -> case1: max(1,M[1]) * max(2,M[2])   case2: max(2,M[2]) * max(1,M[1])
//   size = 4m    ->   M[4] = max(1,M[1]) * max(3,M[3])    M[4] = max(2,M[2]) * max(2,M[2])
//   time Complexity = O(n^2)
//   space = O(n)
    public int CutRod (int n) {
        int [] M = new int[n+1];
        for(int i = 1; i <= n ; i++ ){
            int curMax = 0;
            for(int j = 1; j <= i/2; j++){
                curMax = Math.max(curMax,Math.max(j,M[j])) * Math.max((i-j), M[i-j]);
            }
            M[i] = curMax;
        }
        return M[n];
    }


// solution 2 : 左大段 和右小段
// 大段的意思是说， 我们需要通过读表格，获取M[left]的值
// 小段的意思是说，我们不需要读表格，而是不需要在做任何cut，自成一段绳子
//
//  size = 1m    M[1] = 1 or 0
//  size = 2m   case 1:  M[2] = max(1,M[1]) * 1 =1
//  size = 3m   case 1: M[3] = max(1,M[1]) * 2   case2: M[3] = max(2,max[2]) *1
//  size = 4m   case1: M[4] = max(2,M[2]) * 2 case2: M[3] = max(1,M[1]) * 3 case3: M[3] = max(3,M[3]) * 1
//  ........
//
//
//solution 3 : (Non - DP, Can we do it with Recursion?)
//
    public int getMaxProduct (int n) {
        if(n <= 1) return 0;
        int MaxProduct = 0;
        for(int i = 1; i < n; i++){
            int best = Math.max(n-i,getMaxProduct(n-i));
            MaxProduct = Math.max(MaxProduct, i*best);
        }
        return MaxProduct;
    }
    // time complexity  = O(n!)



//4. jump game
//    Given an array of non-negative integers, you are initially positioned at the first index of the array.
//    Each element in the array represents your maximum jump length at that position.
//    Determine if you are able to reach the last index
//    for example :
//    index 0 1 2 3 4
//    A =  [2,3,1,1,4] return ture
//    B =  [3,2,1,0,4] return false
//      M[i]  i=1       4   true
//            i=2     1 4   true
//            i=3     1  1 4    1 -> M[2]  true
//
//    1.Base case: M[n - 1] = true
//    2. Induction rule : M[i] represents whether or not we can jump to the target from the i-th index
//       a. M[i] =  true  iff there is an element j where j <= i + input[i], and M[j] = true
//                  false otherwise
//    Time = O(n^2) -> O(n*k) where k is the min(n,largest value in the array)
//


}



