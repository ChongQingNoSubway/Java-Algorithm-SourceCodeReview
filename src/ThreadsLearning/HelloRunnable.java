package ThreadsLearning;

public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        for(int i =0; i<150; i++){
            if(Thread.interrupted()){
                System.out.println(i);
                return;
            }
        }
    }
}
