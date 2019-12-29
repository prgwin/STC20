package lab7;

public class App {
    int[] massiv = new int[]{5, 15, 31, 27, 42};

    public static void main(String[] args) {
        App app = new App();
        app.startApp();
    }

    /**
     * Метод запуска программы
     */
    public void startApp() {
        for (int i = 0; i < massiv.length; i++) {
            Factorial f1 = new Factorial(massiv[i]);
            try {
                f1.t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
