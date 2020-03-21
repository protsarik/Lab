package Lab2.zd2;

import java.util.Scanner;

public class Num2_2 {
    public static void main(String[] args) {
        Scanner ves = new Scanner(System.in);
        System.out.print("начальная сумма в рублях А: ");
        int a = ves.nextInt();
        System.out.print("конечная сумма в рублях С: ");
        int c = ves.nextInt();
        System.out.print("годовой процент: ");
        double p = ves.nextDouble();

        double b = a;
        int i = 0;
        while (c >= b) {
            b = b * (1+(p / 100));
            i++;
        }
        System.out.print("Сумма достигнет конечное значение через: " + i + "лет");
    }
}
