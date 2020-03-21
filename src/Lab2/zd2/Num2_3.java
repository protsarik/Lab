package Lab2.zd2;

import java.util.Scanner;

public class Num2_3 {
    private static boolean odness(int a) {
        return (a % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество повторений: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (!odness(i) && i < 100 && i > 9) {
                sum += i;
            }
        }

        System.out.print("Сумма " + sum);
    }
}
