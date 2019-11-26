package lab1.task2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите N определяющую количество случайных чисел");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        List<Integer> listInput = new ArrayList<>(); // Полей
        List<Double> listOutput = new ArrayList<>();

//        System.out.println(Math.sqrt(number));
//        System.out.println("Math.pow(4,2) "+Math.pow(4,2));

        int min = -100;
        int max = 100;
        for (int i = 0; i <number ; i++) {
            int x = (int)(Math.random()*((max-min)+1))+min;
//            int x = 16; //ТЕСТ по числу 16
            listInput.add(x); // Массив входящих значений
            //System.out.println(" Сгенерировано число "+x);
            double buffer = Math.sqrt(x);
            listOutput.add(buffer); // Массив квадратных корней исходящих значений
            int sqrtNumber = (int) buffer;
            if (Math.pow(sqrtNumber,2) == x) {
                System.out.println("Число удовлетворяющее условию " +x);
            }
            //list.add(Math.sqrt(x));
        }
        System.out.println("Массив входящих значений "+ listInput);
        System.out.println("Массив квадратных корней исходящих значений "+ listOutput);
        //System.out.println(number);
        scan.close();
    }

}
