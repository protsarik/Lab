package Lab2.zd1;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner ves = new Scanner(System.in);
        System.out.print("Введи X: ");
        double x = ves.nextDouble();
        System.out.print("Введи Y: ");
        double y = ves.nextDouble();
        System.out.print("Введи Z: ");
        double z = ves.nextDouble();

        if (x > y) {
            if (y < z)
                System.out.println("Самый маленький это Y = " + y);
            else {
                System.out.println("Самый маленький это Z = " + z);
            }
        } else if (z > x) {
            System.out.println("Самый маленький это X = " + x);
        } else {
            System.out.println("Самый маленький это Z = " + z);
        }
    }
}