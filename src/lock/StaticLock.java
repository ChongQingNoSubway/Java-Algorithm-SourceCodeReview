package lock;

public class StaticLock {
    private static int value = 0;
    public static void increase(){
        synchronized(StaticLock.class) {
            value++;
        }
    }
    public synchronized void decrease() {
        value --;
    }
    public static int GetValue() {
        synchronized(StaticLock.class){
            return value;
        }
    }
}
