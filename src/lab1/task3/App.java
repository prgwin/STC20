package lab1.task3;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Дан массив объектов Person. Класс Person характеризуется полями age (возраст, целое число 0-100),
// sex (пол – объект класса Sex со строковыми константами внутри MAN, WOMAN), name (имя - строка).
// Создать два класса, методы которых будут реализовывать сортировку объектов. Предусмотреть единый интерфейс для классов сортировки.
// Реализовать два различных метода сортировки этого массива по правилам:
//первые идут мужчины
//выше в списке тот, кто более старший
//имена сортируются по алфавиту
//Программа должна вывести на экран отсортированный список и время работы каждого алгоритма сортировки.
//Предусмотреть генерацию исходного массива (10000 элементов и более).
//Если имена людей и возраст совпадают, выбрасывать в программе пользовательское исключение.
public class App {
    public static void main(String[] args) {
        App app = new App();

        List<Person> list = new ArrayList<>();
        list.add(new Person(32, "man", "Jon"));
        list.add(new Person(28, "man", "Sam"));
        list.add(new Person(25, "woman", "Sofa"));
        list.add(new Person(36, "man", "Bob"));
        list.add(new Person(28, "woman", "Sara"));
        System.out.println("Входные данные");
        System.out.println(list);

        app.sortedManAddAge(list);
        app.sortedName(list);
    }

    private void sortedName(List<Person> list) {
        long startTime = System.currentTimeMillis();
        SortedNameComparator sortedNameComparator = new SortedNameComparator();
        Collections.sort(list, sortedNameComparator);
        long stopTime = System.currentTimeMillis();
        long resultTime = stopTime - startTime;
        System.out.println(" Данные отсортированны: имена сортируются по алфавиту ");
        System.out.println("resultTime " + resultTime);
        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println("Время сортировки миллисекунд " + resultTime);
    }

    public void sortedManAddAge(List<Person> list) {
        long startTime = System.currentTimeMillis();
        ManAndAgeConparator manAndAgeConparator = new ManAndAgeConparator();
        Collections.sort(list, manAndAgeConparator);
        long stopTime = System.currentTimeMillis();
        long resultTime = stopTime - startTime;
        System.out.println(" Данные отсортированны: первые идут мужчины,выше в списке тот, кто более старший ");
        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println("Время сортировки миллисекунд " + resultTime);
    }
}
