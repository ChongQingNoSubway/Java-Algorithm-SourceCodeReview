package HashTableString;

public class HashTable {

    // For a composition with different kinds of words, try to find the top k frequent words from the
    // composition.

    // Assumptions:
    // step1: iterate over all the composition, and count the frequency of each word by using a
    // hashtable with <key = string, value = int (counter)>
    // step2: use the max_heap with size n , and then keep popping k times
    //        use  a min_heap with size k,



    // if there is only one missing number from 1 to n in an unsorted array. how to find it in O(n) time?
    // size of the array is n-1.

    //solution:
    // HashMap or HashSet
    // step1: use a hashset to store all elements,
    // step2 : iterate over all elements from 1 to n and check against the hash_set
    // Time O（n）  space O(n)

    // Method 2 : XOR bit operation
    //  Step : XOR all elements in the array - result1
    //  step2 : start with result xor 1 xor 2 xor 3 xor 4  - missing number



    // Find the common numbers between two sorted  array  a[n] b[m] n, m
    //
    // Solution:
    // Method 1 : binary search
    // step1 : for each element X in the shorter array, we run a binary search in the longer array
    // Time O(mlongn)

    // Method 2 : hash_table to store all elements from the shorter array , because we want to
    // optimize the space consumption.
    // Step2 : for each element in the longer array, we check it against the hashtable
    // Time O(m+n) Space = O(min(m,n))

    // Method 3 :
}
