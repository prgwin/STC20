package lab5;

import java.util.ArrayList;
import java.util.List;

public class Book implements MakeBooking {

    List<Animal> book = new ArrayList<>();

    /**
     * метод добавления животного в общий список
     *
     * @param id
     * @param animalName
     * @param ves
     * @param name       Класс Person разбит на параметры
     * @param age        Класс Person разбит на параметры
     * @param sex        Класс Person разбит на параметры
     */
    @Override
    public void addAnimal(int id, String animalName, int ves, String name, int age, String sex) {
        Animal animalOther = new Animal(id, animalName, ves);
        animalOther.setOwner(new Person(name, age, sex));
        book.add(animalOther);

        // ФУНКЦИОНАЛ ПРОВЕРКИ НА ДОБАВЛЕНИЕ ДУБЛИКАТОВ РАБОТАЕТ НЕ КОРРЕКТНО

//        if (book.size() == 0) {
//            book.add(animalOther);
//        } else {
//            try {
//                for (Animal animal: book) {
//                   if (animalOther.equals(animal)) {
//                      throw new Exception();
//                   }else {
//                      book.add(animalOther);
//                      return;
//                   }
//                }
//            } catch (Exception e) {
//                System.out.println(" Данное животное уже есть в картотеке");
//            }

    }

    /**
     * поиск животного по его кличке (поиск должен быть эффективным)
     *
     * @param animalName имя животного, которого требуется найти
     */
    @Override
    public void serchAnimal(String animalName) {
        boolean flag = false;
        for (Animal animal : book) {
            if (animalName.equals(animal.getAnimalName())) {
                System.out.println(" Животное найдено");
                System.out.println(animal);
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("Животное не найдено");
        }
    }

    @Override
    public void print() {
        System.out.println(book);
    }

    /**
     * Метод изменения  веса  животного по его идентификатору
     *
     * @param id
     */
    @Override
    public void chageAnimalById(int id, int weight) {
        for (Animal animal : book) {
            Integer id2 = id;
            if (id2.equals(animal.getId())) {
                animal.setWeight(weight);
                System.out.println(" Вес для животного с данным идентификаторм изменен");
                System.out.println(animal);
            }
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "book=" + book +
                '}';
    }
}
