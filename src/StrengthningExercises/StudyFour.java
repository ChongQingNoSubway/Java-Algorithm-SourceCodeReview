package StrengthningExercises;

public class StudyFour {


    // Question1 : Find common elements in two arrays
    // solution: 1. two pointers  Time = O(m + n)
    //           2. hash_set   Time= O(m+n)
    //           3. For each element in array m, do a binary search in array n. O(mlogn)


    // Question2 : Find common elements in 3 sorted array. preferred O(1) space
    // solution1 :    1. three pointers
    //                2.1. find common elements between A1 and A2
    //                2.2. find common elements between result1 and a3
    //             they are both time complexity is O(n)

    // Question3: Find common elements in k sorted arrays
    //          Solution 1 : heap of size k
    //          solution 2 : binary reduction 两两比较
    //          solution 3 : iterative

    // Question 4 一个字典给一系列strings，要求找两个string，使得它们没有共同的字符,并且长度乘积最大
    //          solution ：BFS2
    //                  1.initial state: <s1 x s2>
    //                  2.expansion/generation rule
    //                      expand a state <si x sj>
    //                      i. generate <si + 1, sj>
    //                     ii. generate <si, sj + 1>
    //                  3.termination condition
    //                      a. p-queue is empty ->
    //                      b.  when we popped out a state <si, sj> satisfying that si and sj do not share any common letter -> get solution

    // How to find the k-th smallest number in the f(x,y,z) = 3^x* 5^y * 7^z
    // solution: BFS2
    //      1.initial state : <x = 1 y = 1 z =1>
    //      2.expansion/generation rule : expand<x,y,z>
    //                          a. generate<x+1,y,z>
    //                          a. generate<x,y+1,z>
    //                           a. generate<x,y,z+1>
    // 3.termination condition : when the k-th element is popped out of the heap
    // 4. deduplication : when generating a new state
    //      for example : <2,2,1> can be generated by <1,2,1><2,1,1>
    //



}