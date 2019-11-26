package lab1.task1;

/*Задание 1. Написать программу ”Hello, World!”.
В ходе выполнения программы она должна выбросить исключение и завершиться с ошибкой.
    Смоделировав ошибку «NullPointerException»
    Смоделировав ошибку «ArrayIndexOutOfBoundsException»
    Вызвав свой вариант ошибки через оператор throw
 */
public class App {
    static String a = null;

    public static void main(String[] args) {
        App app = new App();

        app.searchNull(a);       //Метод вызывающий  NullPointerException
        app.arrayException();    //Метод вызывающий и обрабатывающий ArrayIndexOutOfBoundsException,
        app.division(0);      //Метод вызывающий  ArithmeticException
    }

    //Метод вызывающий  NullPointerException
    public void searchNull(String s) {
            try {
                s.trim();
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
    }

    // Метод вызывающий и обрабатывающий ArrayIndexOutOfBoundsException,
    public void arrayException() {
        int[] massiv = {3};
        try {
            massiv[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границу массива");
        }
    }

    //Метод возбуждающий  ArithmeticException
    public void division(int i) {
        try {
            int result = 3 / i;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
