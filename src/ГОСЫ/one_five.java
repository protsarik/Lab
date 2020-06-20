package ГОСЫ;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class one_five {
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
        System.out.print("Введи m: ");
        int m = in.nextInt();
        int k=0, sum = 0;
        for (int i = 0; i < n; i++){
            if (sqrt(name[i]) == m) {
                k++;
                sum += name[i];
            }
        }
        if (k!=0) System.out.println("Sum = " + sum);
        else System.out.println("Таких значений нет!!!");
    }
}/// что то не то с условием возможно, хотя не факт.
