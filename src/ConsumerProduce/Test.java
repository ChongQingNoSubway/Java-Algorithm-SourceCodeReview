package ConsumerProduce;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    private static final int Cap = 5;

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();

        Thread producer1 = new Producer("P1",queue,Cap);
        Thread producer2 = new Producer("P2",queue,Cap);
        Thread consumer1 = new Consumer("C1",queue,Cap);
        Thread consumer2 = new Consumer("C2",queue,Cap);
        Thread consumer3 = new Consumer("C3",queue,Cap);


        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
