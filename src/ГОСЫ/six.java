package ГОСЫ;

import java.util.Scanner;

public class six {
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
        System.out.println("Введи m: ");
        int m = in.nextInt();
        int p=1, k=0;
        for (int i=0; i<n; i++){
            if(name[i] % m == 0)
            {
                k++; p = p*name[i];
            }
            else continue;
        }
        if (k==0) System.out.println("Таких значений нет!!!");
        else System.out.println("P = " + p);
    }
}