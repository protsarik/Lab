package ГОСЫ;

import java.util.Scanner;

import static java.lang.Math.abs;

public class one_two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество элементов массива: ");
        int n = in.nextInt();
        int name[] = new int[n];
        System.out.println("Введем элементы массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "-ый элемент массива = ");
            name[i] = in.nextInt();
        }
        int p, q;
        System.out.println("Введи р и q:");
        System.out.print("p = "); p = in.nextInt();
        System.out.print("q = "); q = in.nextInt();

        for (int i = 0; i < n; i++){
            if (abs(name[i]) % p == q)
            {
                name[i] = 0;
            }
        }

        System.out.println("Преобразованный массив");
        for (int i = 0; i < n; i++){
            System.out.println(i+1 + "-ый элемент массива = " + name[i]);
        }
    }
}