package ProbabilitySamplingRandomization;

public class guide {
    // Question1 : shuffling Algorithm
    //    1.1 spades
    //    1.2 hearts
    //    1.3 diamonds
    //    1.4 clubs

    // Question2 : how to do sampling for an unlimited data flow and when reading the n-th element
    // we are required to return one random number among all numbers read so far, such that the probability
    // returning any element read so far is 1/n.

    // Solution :
    // t = 0 call random [0-0] = random_num1, if random_num1 == 0 -> solu = input[0],
    // t = 1 call random [0-1] = random_num2, if random_num2 == 0 -> solu = input[1]
    // t = 2 call random [0-2] = random_num3, if random_num2 == 0 -> solu = input[2]


//    public int solutionForQuestiontwo (int []input, int i) {
//        int solu = input[1];
//        int solu_so_far;
//        while(true) {
//            int r =  Math.random(1,i-1);
//            if(r == 0) {
//                solu_so_far = input[i];
//            }
//        }
//    }


    //Question 2c: what if we ask you to return a random largest number's index
    // For example , given a stream like "1 , 2, 5a, 3, 4, 5b"
    //
    // solution: int  max_so_far = 5
    // int counter_max_number = 2
    // int sulu = 5b

    // Question 3: How to design a random number generate Random(7), with Random(5)
    // Random(7) : [0-6]
    // Random(5) : [0-4]


    // Question 3b: how to design a random number generator Random(1,000,000), with Random(5)
    // we only need to call random(2) 20 times to solve this problem


    //Question 4: Given an unlimited data flow, how to keep track of the median of the number read so far?
    // O(n) space
    //  max-heap and min-heap
    // case1 : if Max-heap.size() > Min-heap.size().
    //      case 1.1 x<Max_heap.top(). we call Max-heap.insert(X). and then
    //                Min-heap.insert(Max-heap.pop())
    //      case 1.2 else Min-heap.insert(X)
    // case2: if Max-heap.size() == Min-heap.size().
    //      case 2.1 X < Max_heap.top() we call Max-heap.insert(X). and then
    //              Min-heap.insert(Max-heap.pop())
    //      case 2.2 else : Min-heap.insert(x), call Max-heap(Min-heap.pop())
    //
    //  Be careful , we are keep the max-heap.size() >= min-heap.size()
    //


    // Follow up : delog(What if the number of element is too large to be stored into the memory)

    // Given a certain number(100000) of urls, how to find 95th percentile of all Url length
    // Solution:
    // 1. sort all urls accoring to their lengths.
    // 2. and then return input[100000 * 0.95]
    //  Time = O(nlogn)
    //  Space = O(sum of size of all urls)
    //
    // Solution2 :
    //  assume: the maximum length of url < 4100 letters
    //  use a Bucket[4100];
    //  Step1 : iterate over all urls one by one , and for each urls X, we Bucket[X.length]++ O(N)
    //  Step2: for (i = 0; i < 4100 ; i++){
    //   couter+ = Bucket[i];
    //   if(couter >= 100000 *0.95) {
    //         return i;
    //  }
    // }

}
