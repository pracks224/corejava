package BiFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> ls = new ArrayList<>();
        Person p1 = new Person("Prakash1",35,60000);
        Person p2 = new Person("Prakash2",35,50000);
        Person p3 = new Person("Prakash1",35,10000);

        ls.add(p1);
        ls.add(p2);
        ls.add(p3);

        Comparator<Person> c = (a,b)->Person.compareSalary.apply(a,b);
        Collections.sort(ls,c);
        System.out.println(ls.get(0).name);

    }
}
