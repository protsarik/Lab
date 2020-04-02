package Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IndiTsar {
    public static void main(String[] args) {
        double n;
        double f2 = 0;
        double f1 = 0;
        try {
            System.out.println("Выводим вещественные числа иp файла");
            Scanner in = new Scanner(new File("src/Lab3/float.txt"));
            f1 = in.nextDouble();
            System.out.println("Файл найден");
            while (in.hasNext()) {
                f2 = in.nextDouble();
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("А файл тебе значит не нужен?...");
        } finally {
            n = f1 - f2;
            System.out.println("Разность= " + n);
        }
    }
}
