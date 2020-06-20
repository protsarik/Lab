package ГОСЫ;

import java.util.Scanner;

public class one_nine {
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
        System.out.println("Введи 2 индекса от 0 до " + (n-1));
        System.out.print("a = "); int a = in.nextInt();
        System.out.print("b = "); int b = in.nextInt();

        int z = name[a];
        name[a] = name[b];
        name[b] = z;
        System.out.println("Преобразованный массив:");
        for (int i = 0; i < n; i++) System.out.println(i + "-ый элемент массива = " + name[i]);
    }
}
