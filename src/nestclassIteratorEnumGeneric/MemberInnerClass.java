package nestclassIteratorEnumGeneric;

public class MemberInnerClass {
    public int i = 0;
    private static int j = 0;
    private final int k = 0;
    private static final int m = 0;

    public class PublicMemberInnerClass {
        // the innerClass can access all
        public void test() {
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
            System.out.println(m);
        }
        public MemberInnerClass getOutterClass() {
            return MemberInnerClass.this;
        }
        // can not define static method
        // private static final void test();
    }
    private class PirvateMemberInnerClass{

    }

    class DefaultMemberInnerClass{
        public MemberInnerClass getOutterClass() {
            return MemberInnerClass.this;
        }
    }

}
