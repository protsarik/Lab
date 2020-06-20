package ГОСЫ;

import java.util.Scanner;

public class one_three {
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
        System.out.println();
        int k = 0, sum = 0;
        double sr = 0;
        for (int i = 0; i < n; i++) {
            if (name[i] == i+1) {
                k++;
                sum = sum + name[i];
            }
        }
        if (k!=0) {
            sr = (double)sum/k;
            System.out.println("Sum = " + sum + " k = " + k + " Sr = " + sr);
        }
        else System.out.println("Таких значений нет!!!");
    }
}///////// подумать с индексами
