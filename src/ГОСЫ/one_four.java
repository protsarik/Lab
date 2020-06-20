package ГОСЫ;

import java.util.Scanner;

public class one_four {
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
        System.out.println("Введи число от 0 до 9: ");
        int r = in.nextInt();
        int k=0;
        for (int i = 0; i < n; i++){
            if (name[i] % 10 == r)
            {
                k++;
                System.out.println(i+1 + "-ый элемент массива = " + name[i]);
            }
        }
        if (k==0) System.out.println("Таких значений нет!!!");
    }
}
