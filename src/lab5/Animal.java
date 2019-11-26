package lab5;

import java.util.Objects;

public class Animal {
    private final int id;
    private String animalName;
    private int weight;
    Person owner;


    public Animal(int id, String animalName, int ves /*,Person owner*/) {
        this.id = id;
        this.animalName = animalName;
        this.weight = ves;
        //this.owner = owner;
        // Пришлось убрать из конструктора, так как не получилось передать параметры для создания объекта Person
    }


    public int getId() {
        return id;
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", owner=" + owner +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id &&
                Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, animalName);
    }
}
