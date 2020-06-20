package ГОСЫ;

import java.util.Scanner;

public class two_three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество элементов массива: ");
        int n = in.nextInt();
        int name[] = new int[n];
        System.out.println("Введем элементы массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + "-ый элемент массива = ");
            name[i] = in.nextInt();
        }
        System.out.println();
        int max = name[0];
        for (int i = 0; i < n; i++)
            if (name[i]>max)
            {
                max = name[i];
            }
        System.out.println("Преобразованный массив: ");
            for (int i = 0; i < n; i++)
            {
                System.out.println(i + "-ый элемент массива = " + (max - name[i]));
            }
    }
}