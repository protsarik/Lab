package Lab_2_Ignatos.Lab_2_Lapts;

import java.util.Scanner;

public class Z2_3 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.println("Введи А");
        int A = pr.nextInt();
        System.out.println("Введи В");
        int B = pr.nextInt();
        System.out.println("Результат ");
        for (int i = A; i <= B; i++) {
            if (i < 0) {
                System.out.println(i);
            }
        }
    }
}