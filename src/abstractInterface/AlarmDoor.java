package abstractInterface;

public class AlarmDoor extends door implements Alarm{
    void open() {
        System.out.println("open the door");
    }
    void close() {
        System.out.println("open the close");
    }
    public void alarming() {
        System.out.println("open the alarming");
    }
}
