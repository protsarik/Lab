package ГОСЫ;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество элементов массива: ");
        int n = in.nextInt();
        int A[] = new int[n];
        System.out.println("Введем элементы массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "-ый элемент массива = ");
            A[i] = in.nextInt();
        }
            int max = A[0];
            int min = A[0];
        for (int i = 1; i < n; i = i+2){
            if (A[i] > max){ max = A[i]; }
        }
        System.out.println("max из нечечных индексов = " + max);

        for (int i = 0; i < n; i = i+2){
            if (A[i] < min){ min = A[i]; }
        }
        System.out.println("min из четных = " + min);
    }
}
