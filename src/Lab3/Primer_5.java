package Lab3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class Primer_5 {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        try { // выполнение алгоритма счит и обраб полученных данных
            Scanner in = new Scanner(new File("in.txt"));
            while (in.hasNext()) { //пока есть символы в потоке
                num1 = in.nextInt();
                num2 = in.nextDouble();
                name = in.next();
                System.out.println(num1 + "" + num2 + "" + name + "");
            }
            in.close();
        } // обработка возможных ошибок
        catch (FileNotFoundException ex) { // файл не найден
            ex.printStackTrace(); // печать трассировки стека
        } catch (NoSuchElementException ex) {
            // нет значения для считывания или значение не соответствует ожидаемому
            // формату
            System.out.println("Input file is incorrect...");
        }
    }
}
