package HeapGraphSearchAlgorithm;

import java.util.PriorityQueue;

public class Heap {



    public static  int[] FindKSmallestsFromn(int [] nums, int n) {
        PriorityQueue<Integer> sortedArray = new PriorityQueue<Integer>(nums.length);
        int [] result = new int[n];

        for(int el: nums){
            sortedArray.add(el);
        }
        for(int i=0; i < result.length; i++){
            result[i] = sortedArray.poll();
        }

        return result;
    }


    public static void main(String[] args){
        int [] A = {1,45,72,145,82,134,82,72,21,13,45};

        int [] result = FindKSmallestsFromn(A,3);

        printArray(result);
    }


    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

        System.out.println(7+9);
    }
}
