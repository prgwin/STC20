package lab5;

public class App {
    public static void main(String[] args) {
        MakeBooking makeBooking = new Book();

        makeBooking.addAnimal(012, "Barboss", 15, "Vasia", 25, "man");
        makeBooking.addAnimal(017, "Tiger", 20, "Bob", 29, "man");
        makeBooking.addAnimal(95, "Sharik", 20, "Bob", 29, "man");

        makeBooking.print();

        makeBooking.serchAnimal("Tiger");
        makeBooking.chageAnimalById(017, 25);

    }
}
