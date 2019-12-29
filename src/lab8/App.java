package lab8;

public class App {
    public static void main(String[] args) {
        Person persOne = new Person("Jon", 25, 1.7, true);
        Person persTwo = new Person();
        persOne.serialize(persOne, "lab8result");
        persTwo = (Person) persOne.deSerialize("lab8result");
        System.out.println(persTwo);

    }
}
