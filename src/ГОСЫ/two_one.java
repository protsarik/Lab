package ГОСЫ;

import java.util.Scanner;

public class two_one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();
        double[] mas = new double[n];
        int i = 0;
        double sum = 0;
        int count = 0;
        double sr = 0;
        int x = 0;
        System.out.println("Введите массив: ");
        for (i = 0; i < mas.length; i++) {
            System.out.printf("a[%d] = ", (i + 1));
            mas[i] = in.nextDouble();
        }
        System.out.print("Результат: ");
        for (i = 0; i < mas.length; i++) {
            count++;
            sum += mas[i];
            sr = sum / count;
        }
        for (i = 0; i < mas.length; i++) {
            if (Math.abs(sr - mas[i]) < Math.abs(sr - mas[x])) {
                x = i;
            }
        }
        System.out.println("Среднее арефметическое = " + sr);
        System.out.printf("Наиболее близкое значение = %.2f", mas[x]);
    }
}
