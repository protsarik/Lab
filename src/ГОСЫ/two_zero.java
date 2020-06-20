package ГОСЫ;

import java.util.Scanner;

public class two_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество элементов массива: ");
        int n = in.nextInt();
        int name[] = new int[n];
        System.out.println("Введем элементы массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + "-ый элемент массива = ");
            name[i] = in.nextInt();}
            System.out.println();
            int k = 0, p = 1;
            for (int i = 0; i < n; i++) {
                if (name[i] < 0) {
                    for (int j = i+1; j < n; j++)
                    {
                        if (name[j] >= 0)
                        {
                            k++;
                            p = p * name[j];
                        }
                        else break;
                    }
                    break;
                }
            }
            if (k == 0) System.out.println("No!!!");
            else System.out.println("k = " + k + " p = " + p);
        }
}
