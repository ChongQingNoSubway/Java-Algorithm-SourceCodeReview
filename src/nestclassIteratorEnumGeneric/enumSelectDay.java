package nestclassIteratorEnumGeneric;

public class enumSelectDay {

    WeekDay weekday = WeekDay.SUN;

    public void select() {
        switch(weekday){
            case SUN:
                weekday = WeekDay.SUN;
                break;
        }
    }
}
