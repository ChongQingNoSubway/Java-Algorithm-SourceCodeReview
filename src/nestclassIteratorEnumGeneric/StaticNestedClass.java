package nestclassIteratorEnumGeneric;

public class StaticNestedClass {
    private int i = 0;

    public static int j = 0;

    private final int k = 0;

    private static final int m = 0 ;

    public  static class PublicNestClass{
        // nest class only can access the static
        private void test() {
            System.out.println(j);
            System.out.println(m);
        }
    }

}
