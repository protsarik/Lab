package ГОСЫ;

import java.util.Scanner;

public class two {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество элементов массива: ");
        int n = in.nextInt();
        int name[] = new int[n];
        System.out.println("Введем элементы массива: ");
        for (int i=0; i<n; i++)
        { System.out.print(i+1 + "-ый элемент массива = ");
            name[i] = in.nextInt(); }
        System.out.println();
        int sum = 0;
        int k = 0;
        double sr = 0;
        for (int i=0; i<n; i++){
            if (name[i] % 2 == 1)
            {
                k++;
                sum += name[i];
            }
            else continue;
        }
        if (k!=0){
        sr = (double)sum/k;
        System.out.println("k = " + k + " Sum = " + sum + " Sr = " + sr);}
        else System.out.println("Таких значений нет!!!");
    }
}
