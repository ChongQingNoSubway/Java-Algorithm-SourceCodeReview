package QueueStackLinkList;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static int[] sortArrayByParity(int[] A) {
            if(A == null) return A;
            if(A.length < 2) return A;
            Queue<Integer> odd = new LinkedList();
            Queue<Integer> even = new LinkedList();

            for (int i = 0; i< A.length; i++) {
                if(A[i] % 2 == 0) {
                    even.offer(A[i]);
                }
                else{
                    odd.offer(A[i]);
                }
            }
            int l1 = even.size();
            System.out.println(l1);
//            if(l1 > 0) {
                for (int j = 0; j < l1; j++) {
                    A[j] = even.poll();
                    System.out.println(A[j]);
                }
//            }

            int l2 = odd.size();
            System.out.println(l2);
//            if(l2 > 0) {
                for (int k = 0; k < l2; k++) {
                    A[k + l1] = odd.poll();
                    System.out.println("xxxx");
                    System.out.println(A[k + l1]);
                }
//            }
            return A;
        }
    public static void main(String[] args) {
        int[] keys = { 1, 3 };
//        queueByTwoStacks q = new queueByTwoStacks();
//
//        // insert above keys
//        for (int key : keys) {
//            q.enqueue(key);
//        }
//
//        System.out.println(q.dequeue());    // print 1
//        System.out.println(q.dequeue());// print 2
//        q.enqueue(123);
//        q.enqueue(4444);
//        System.out.println(q.dequeue());
//        q.enqueue(4444);
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());

        int [] a = sortArrayByParity(keys);
        printArray(a);
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

}
