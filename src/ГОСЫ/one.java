package ГОСЫ;

import java.util.Scanner;

public class one {
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
      /*  for (int i=0; i<n; i++){
            System.out.print(" " + name[i]);
        } */
      int k=0;
      for (int i =0; i<n; i++){
          if (name[i] > 15){
              System.out.println(i+1 + "-ый элемент массива = " + name[i]);
                k++;
                if (k == 3) {
                    System.out.println("k = " + k);
                    System.out.println("k = 3!"); break;}
                else continue;
          }
      }
      if (k==0) System.out.println("Таких значений нет");
      else if (k>0 && k<3) System.out.println("Таких значений меньше 3х");
    }
}
