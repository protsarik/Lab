package ГОСЫ;

import java.util.Scanner;

public class five {
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
        for (int i=0; i<n; i++){
            if ( (name[i]%5 == 0) && (name[i]%7 != 0) ){
                k++;
                sum += name[i];
            }
            else continue;
        }
        if (k!=0) System.out.println("K = " + k + " Sum = " + sum);
        else System.out.println("Таких значений нет!!!");
    }
}
