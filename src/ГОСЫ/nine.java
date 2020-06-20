package ГОСЫ;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество элементов массива: ");
        int n = in.nextInt();
        double name[] = new double[n];
        System.out.println("Введем элементы массива: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "-ый элемент массива = ");
            name[i] = in.nextDouble();
        }
        System.out.println();

        double sum = 0, sr = 0;
        for (int i = 0; i < n; i++) {
            sum += name[i];
        }
        sr = (double) sum / n;
 //       System.out.println("Sr = " + sr);

        for (int i = 0; i < n; i++){
            name[i] = name[i] - sr;
        }
        System.out.println("Преобразованный массив");
        for (int i = 0; i < n; i++){
            System.out.println(i+1 + "-ый элемент массива = " + name[i]);
        }
    }
}