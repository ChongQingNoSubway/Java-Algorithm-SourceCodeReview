package nestclassIteratorEnumGeneric;

import java.util.EnumSet;

public class Test {
    public static void main(String[] agrs) {

        EnumSet<WeekDay> week = EnumSet.noneOf(WeekDay.class);

        week.add(WeekDay.MON);
        System.out.println("enumSet:" + week );
        week.remove(WeekDay.MON);
        System.out.println("enumSet:" + week );
        week.addAll(EnumSet.complementOf(week));
        System.out.println("EnumSet：" + week);
        week.removeAll(EnumSet.range(WeekDay.FRI, WeekDay.SAT));
        System.out.println("EnumSet：" + week);
}
}
