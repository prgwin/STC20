package lab1.task3;

import java.util.Comparator;

public class ManAndAgeConparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getSex().compareTo(o2.getSex());
        if (result != 0) {
            return result;
        } else {
            return o2.getAge() - o1.getAge(); // выше в списке тот, кто более старший
        }
    }
}
