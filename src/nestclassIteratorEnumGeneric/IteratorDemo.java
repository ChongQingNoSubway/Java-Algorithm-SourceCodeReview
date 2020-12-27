package nestclassIteratorEnumGeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args){
        List<String> lst = new ArrayList<String>();
        lst.add("add");
        lst.add("xxxx");
        lst.add("sxsx");
        lst.add("sad");
        
        Iterator<String> iterator = lst.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
