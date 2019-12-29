package lab7;

import java.math.BigInteger;

public class Factorial implements Runnable {
    int number;
    Thread t;

    public Factorial(int number) {
        this.number = number;
        t = new Thread(this);
        System.out.println("Создан Поток " + t);
        t.start();
    }

    @Override
    public void run() {
        result(number);
    }

    /**
     * Метода расчета факториала
     *
     * @param num число для которого нужно расчитать факториал
     */
    public void result(int num) {
        BigInteger func = BigInteger.ONE;
        for (Integer i = 1; i <= num; i++) {
            func = func.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Факториал " + num + " равен " + func);
    }
}

