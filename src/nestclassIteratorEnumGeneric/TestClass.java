package nestclassIteratorEnumGeneric;

public class TestClass {

    public static void main(String[] args) {
        StaticNestedClass.PublicNestClass publicNestClass = new StaticNestedClass.PublicNestClass();

        MemberInnerClass t = new MemberInnerClass();
        MemberInnerClass.PublicMemberInnerClass pimc = t.new PublicMemberInnerClass();
        MemberInnerClass.DefaultMemberInnerClass dimc = t.new DefaultMemberInnerClass();

        // error， can not access inner class
        // MemberInnerClass.PrivateMemberInnerClass pmic = t.new
        // PrivateMemberInnerClass();

        System.out.println(pimc.getOutterClass() == t);
        System.out.println(dimc.getOutterClass() == t);
    }
}
