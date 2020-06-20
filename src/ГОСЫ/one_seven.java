package ГОСЫ;

import java.util.Scanner;

public class one_seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество элементов массива: ");
        int n = in.nextInt();
        double name[] = new double[n];
        System.out.println("Введем элементы массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "-ый элемент массива = ");
            name[i] = in.nextDouble();
        }
        System.out.println();
        double min = name[0];
        for (int i = 0; i < n; i++) {
            if (name[i] < min) {min = name[i];}
        }
        System.out.println("min = " + min);
        if (min == 0) System.out.println("min = 0");
        else {
            System.out.println("Преобразованный массив: ");
            for (int i = 0; i < n; i++) {
                System.out.print(i + 1 + "-ый элемент = ");
                name[i] = name[i] / min;
                System.out.println(name[i]);
            }
        }
    }
}
