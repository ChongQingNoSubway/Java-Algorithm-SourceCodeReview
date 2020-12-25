package nestclassIteratorEnumGeneric;

public class EnclosingClass {

    public static final class nestMemberClass{

    }

    public void nestLocalClass () {
        final class nestedLocalClass {

        }
    }

    public void nestAnonymousClass() {
        new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
