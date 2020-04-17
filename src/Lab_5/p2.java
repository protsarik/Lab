package Lab_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int size = 20;
        int[][] array = {{180,80},{150,100},{190,50}};

//        try {
//            System.out.println("Выводим массив из файла");
//            Scanner in = new Scanner(new File("src/Lab_5/intMassive.txt"));
//            while (in.hasNext()) {
//                array[0][1] = in.nextInt();
//            }
//            System.out.println();
//            in.close();
//        } catch (
//                FileNotFoundException ex) {
//            System.out.println("А файл тебе значит не нужен?...");
//        }
        int p = 0;
        int count = 0;
        System.out.println("Следующие кандидаты не подходят:");

        for (int[] innerArrayRost : array) {
            count++;
            for (int outArray : innerArrayRost) {

                if (outArray < (p - 100) - 3 || outArray > (p - 100) + 3 && p > outArray) {

                    System.out.println("" + count);

                }
                p = outArray;
            }
        }
    }
}

