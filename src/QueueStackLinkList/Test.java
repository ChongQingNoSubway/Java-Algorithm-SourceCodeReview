package QueueStackLinkList;

public class Test {
    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4 };
        queueByTwoStacks q = new queueByTwoStacks();

        // insert above keys
        for (int key : keys) {
            q.enqueue(key);
        }

        System.out.println(q.dequeue());    // print 1
        System.out.println(q.dequeue());// print 2
        q.enqueue(123);
        q.enqueue(4444);
        System.out.println(q.dequeue());
        q.enqueue(4444);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
