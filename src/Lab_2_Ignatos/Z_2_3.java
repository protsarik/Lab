package Lab_2_Ignatos;

import java.util.Scanner;

public class Z_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи А");
        int A = scanner.nextInt();
        System.out.println("Введи В");
        int B = scanner.nextInt();
        System.out.println("Результат ");
        for (int i = A; i <= B; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}