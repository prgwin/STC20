package lab3.task1;

public class App {
    public static void main(String[] args) {
        MathBox box = new MathBox(new Integer[]{4, 8, 12, 16});
        MathBox box2 = new MathBox(new Integer[]{4, 8, 12, 16});

        box.convertToCollectoin();

        box.splitter(2);
        System.out.println("Сумма элементов массива равна: " + box.summator());
        //System.out.println(" box.number " +box.number.toString());
        System.out.println(" box.list " + box.list);
        box.searchNumber(6);
        System.out.println(" box.list " + box.list);


    }
}
