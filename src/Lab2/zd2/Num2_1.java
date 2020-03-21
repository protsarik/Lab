package Lab2.zd2;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Num2_1 {
    public static void main(String[] args) {
        Scanner ves = new Scanner(System.in);
        System.out.print("начальная точка а: ");
        double a = ves.nextDouble();
        System.out.print("конечная точка b: ");
        double b = ves.nextDouble();
        System.out.print("шаг h: ");
        double h = ves.nextDouble();
        double i = 0;
        double y = 0;
        double x = 0;
        do {
            x = a + i;
            i += h;
            y = pow((x + 2), 3);
            System.out.print(y + " ");
        } while (b >= x);
    }
}
