package ThreadsLearning;

public class Test {

    public static void main(String[] args) {
        Thread newThread = new HelloThread();
        newThread.start();
    }

}
