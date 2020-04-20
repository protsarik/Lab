package Lab5;

import java.util.Scanner;

public class Lapka_2_1 {
    public static void main(String[] args){
        int[] Array = {1, 2, 3, 7, 4, 5, 8, 48, 4, 46, 9, 7, 14, 54, 65, 74, 20};
        Scanner a = new Scanner(System.in);
        System.out.print("vvedi x:");
        int x = a.nextInt();
        System.out.println("x = " + x);
        int sum=0;
        for(int i=0; i<Array.length; i++){
            if (Array[i]%x==0){
                sum += Array[i];
            }
            else continue;
        }
        System.out.println("Sum = " + sum);
    }
}
