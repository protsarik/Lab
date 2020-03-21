package Lab2.zd1;

import java.util.Scanner;

public class Num1_3 {
    public static void main(String[] args) {
        Scanner ves = new Scanner(System.in);
        System.out.print("Введи месяц 2020 года: ");
        int n = ves.nextInt();
        switch (n) {
            case 1:
                System.out.print("В этом месяце 31 день");
                break;
            case 2:
                System.out.print("В этом месяце 29 дней");
                break;
            case 3:
                System.out.print("В этом месяце 31 день");
                break;
            case 4:
                System.out.print("В этом месяце 30 дней");
                break;
            case 5:
                System.out.print("В этом месяце 31 день");
                break;
            case 6:
                System.out.print("В этом месяце 30 дней");
                break;
            case 7:
                System.out.print("В этом месяце 31 дней");
                break;
            case 8:
                System.out.print("В этом месяце 31 день");
                break;
            case 9:
                System.out.print("В этом месяце 30 дней");
                break;
            case 10:
                System.out.print("В этом месяце 31 день");
                break;
            case 11:
                System.out.print("В этом месяце 30 дней");
                break;
            case 12:
                System.out.print("В этом месяце 31 день");
                break;
            default:
                System.out.print("Вы ввели неверное значение, от 1 до 12");
        }
    }
}
