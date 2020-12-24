package abstractInterface;

public class Circle extends Figure {
    private float radius = 3;
    public void getArea() {
        float result = (float) (3.14 * radius * radius);
        System.out.println(result);
    }
}
