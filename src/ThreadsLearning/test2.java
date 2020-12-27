package ThreadsLearning;

public class test2 {
    public static void main (String[] args) {
        Thread newThread = new Thread(new HelloRunnable());
        newThread.start();
        newThread.interrupt();
    }
}
