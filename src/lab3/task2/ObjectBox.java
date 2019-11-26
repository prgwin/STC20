package lab3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ObjectBox {
    List<Object> objects = new ArrayList<>();

    /**
     * метод  добавляющий объект в коллекцию.
     */
    public void addObject() {
        objects.add(new Object());
    }

    /**
     * метод  проверяющий наличие объекта в коллекции и при наличии удаляющий его.
     *
     * @param obj искомый объект
     */
    public void deleteObject(Object obj) {
        ListIterator listIterator = objects.listIterator();
        while (listIterator.hasNext()) {
            if (obj.equals(listIterator.next())) {
                listIterator.remove();
            }
        }
    }

    /**
     * метод  выводящий содержимое коллекции в строку.
     */
    public void dump() {
        for (Object obj : objects) {
            System.out.print(obj);
        }
    }

}
