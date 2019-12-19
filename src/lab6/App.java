package lab6;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        String path = "lab6.txt";              //Исходный файл
        String pathResult = "lab6Result.txt";  //Итоговый файл

        readFile(path, set);
        writeFile(pathResult, set);

       /* СОДЕРЖИМОЕ ФАЙЛА  lab6.txt
          Hello
          Yes
          Abby
          Bobby
          Abby
          London
        */
    }

    /**
     * метод читающий даные их исходного файла
     *
     * @param path Путь к исходному файлу
     * @param set  множество для хранения списка слов
     */
    public static void readFile(String path, Set set) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                set.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * метод записи в итоговый файл
     *
     * @param pathResult Путь к итоговому файлу
     * @param set        множество для хранения списка слов
     */
    public static void writeFile(String pathResult, Set set) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(pathResult))) {
            for (Object s : set) {  //
                dos.writeUTF((String) s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
