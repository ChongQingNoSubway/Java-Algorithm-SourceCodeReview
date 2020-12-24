package abstractInterface;

public class Rectangle extends Figure{
    private float length = 2, width =3;
    public void getArea(){
        float result = length*width;
        System.out.println(result);
    }
}
