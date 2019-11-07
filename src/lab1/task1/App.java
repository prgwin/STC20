package lab1.task1;

/*Задание 1. Написать программу ”Hello, World!”.
В ходе выполнения программы она должна выбросить исключение и завершиться с ошибкой.
    Смоделировав ошибку «NullPointerException»
    Смоделировав ошибку «ArrayIndexOutOfBoundsException»
    Вызвав свой вариант ошибки через оператор throw
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        String[] list = {"One", null, "Good"};
        System.out.println(" Hello, World");

        for (String i : list) {
            try {
                app.searchNull(i);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            app.arrayException();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    //Метод вызывающий  NullPointerException
    private void searchNull(String s) throws NullPointerException {
        if (s == null) {
            throw new  NullPointerException ("Элемент Null");
        } else
            System.out.println(s);
    }
    /* Метод вызывающий и обрабатывающий ArrayIndexOutOfBoundsException,
       так же вызывающий, но не обрабатывающий ArithmeticException
    */

    private void arrayException()throws ArithmeticException {
        int[] massiv = {3};
        try {
            massiv[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границу массива");
            throw new  ArithmeticException();
        }
    }
}
