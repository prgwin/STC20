package lab3.task1;

import java.util.*;

public class MathBox {
    Integer[] number;
    List<Integer> list = new ArrayList<>();
    Integer summ = 0;

    public MathBox(Integer[] number) {
        this.number = number;
    }

    /**
     * Метод конвертирует массив в коллекцию ArrayList
     */
    public void convertToCollectoin() {
        list = new ArrayList<Integer>(Arrays.asList(number));
        System.out.println(" number is MathBox " + number.toString());
    }

    /**
     * Метод возвращающий сумму всех элементов коллекции
     *
     * @return summ сумма всех элементов коллекции
     */
    public Integer summator() {
        for (Integer element : list) {
            summ = summ + element;
        }
        return summ;
    }

    /**
     * Метод выполняющий поочередное деление всех хранящихся в объекте элементов на делитель,
     * являющийся аргументом метода. Хранящиеся в объекте данные полностью заменяются результатами деления.
     *
     * @param a делитель
     */
    public void splitter(int a) {
        try {
            if (a == 0) throw new ArithmeticException();

            System.out.println("Входные данные " + list);
            Integer buffer;
            ListIterator listIter = list.listIterator();
            while (listIter.hasNext()) {
                buffer = (Integer) listIter.next() / a;
                listIter.set(buffer);
            }
            System.out.println("Выходные данные " + list);

        } catch (ArithmeticException e) {
            System.out.println(" Введенный параметр некорректен, на ноль делить нельзя");
        }

    }

    /**
     * Метод получает на вход Integer и если такое значение есть в коллекции, удаляет его.
     *
     * @param number искомое значение, которое необходимо удалить
     */
    public void searchNumber(Integer number) {
        ListIterator listIter = list.listIterator();
        while (listIter.hasNext()) {
            if (number.equals(listIter.next())) {
                listIter.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "number=" + Arrays.toString(number) +
                ", list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox box = (MathBox) o;
        return Objects.equals(list, box.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(list);
    }
}
