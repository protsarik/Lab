package ГОСЫ;

import java.util.Scanner;

public class one_six {
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
        int max = name[0];
        int z = name[1];
        for (int i = 0; i < n; i++){
            if (name[i] > max)
            {
                max = name[i];
                name[1] = max;
                name[i] = z;
            }
        }
        System.out.println("max = " + max);
        System.out.println("Преобразованный массив: ");
        for (int i = 0; i < n; i++){
            System.out.println(i+1 + "-ый элемент массива = " + name[i]);
        }
    }
}
