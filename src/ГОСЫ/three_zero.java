package ГОСЫ;

import java.util.Scanner;

public class three_zero {
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
        int z = 0;
        int min = name[0];
        int k = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (name[i] < min) {
                min = name[i];
                i = z;
            }
        }
        for (int j = z + 1; j < n; j++)
        { sum = sum + name[j]; }
        System.out.println("Sum = " + sum);
    }
}