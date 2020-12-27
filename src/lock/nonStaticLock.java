package lock;

public class nonStaticLock {
    private int value;
    public nonStaticLock(int value){
        this.value= value;
    }

    public void increase() {
        synchronized(this){
            value++;
        }
        System.out.println("hello");
    }

    public synchronized void decrease(){
        value--;
    }

    public synchronized int GetCount() {
        return value;
    }
}
