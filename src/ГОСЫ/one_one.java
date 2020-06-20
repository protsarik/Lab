package ГОСЫ;

import java.util.Scanner;

public class one_one {
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
        int k=0, sum=0;
        for (int i = 0; i < n; i++) {
            if ((name[i]<0) && (name[i] % 2 == -1))
            {
                k++;
                sum = sum + name[i];
            }
        }
        if (k==0) System.out.println("Таких значений нет!!!");
        else System.out.println("Sum = " + sum);
    }
}