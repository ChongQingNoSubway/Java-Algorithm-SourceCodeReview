package abstractInterface;

public class testAbstract {
    public static void main (String[] args){
        AlarmDoor Mydoor = new AlarmDoor();
        Mydoor.alarming();
        Mydoor.open();
        Mydoor.close();



        // Rectangle and Circle
        Rectangle myR = new Rectangle();
        Circle myC = new Circle();
        myR.getArea();
        myC.getArea();
    }
}
