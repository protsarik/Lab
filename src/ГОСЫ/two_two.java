package ГОСЫ;

import java.util.Scanner;

import static java.lang.Math.abs;

public class two_two {
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
        System.out.println("Введи число P: ");
        int P = in.nextInt();
        int k=0;
        System.out.println("Номера элементов, которые больше Р:");
        for (int i = 0; i < n; i++)
        {
            if (abs(name[i])>P)
            {
                k++;
                System.out.println(i);
            }
        }
        if (k == 0) System.out.println("Таких значений нет");
    }
}
