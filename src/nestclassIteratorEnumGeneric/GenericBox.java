package nestclassIteratorEnumGeneric;

public class GenericBox<T> {
    private T t;
    public void set(T t) {this.t = t;}
    public T get() {return t;}

    public static void main(String[] args){
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        GenericBox<String> StringBox = new GenericBox<String>();

        integerBox.set(new Integer(10));
        StringBox.set(new String("test"));

        System.out.println("output-int:"+integerBox.get());
        System.out.println("output-String:"+ StringBox.get());
    }
}

// Reuse GenericBox According to type i want
//GenericBox<Integer> IntegerBox = new GenericBox<Integer>();
//GenericBox<Double> DoubleBox = new GenericBox<Double>();
//GenericBox<String> StringBox = new GenericBox<String>();
