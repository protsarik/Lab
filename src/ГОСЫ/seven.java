package ГОСЫ;

import java.util.Scanner;

public class seven {
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

        for (int i = 0; i < n; i++) {
            if (name[i] < 0) {
                name[i] = name[i] + 0.5;
            } else {
                name[i] = name[i] + 0.1;
            }
        }
        System.out.println("Преобразованный массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + "-ый элемент массива = " + name[i]);
        }
    }
}
