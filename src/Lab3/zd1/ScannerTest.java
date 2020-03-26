package Lab3.zd1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        int num1;
        double num2;
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целочисленное:");
        num1=in.nextInt();
        System.out.println("Введите вещественное: ");
        num2=in.nextDouble();
        System.out.println("Введите строку: ");
        str=in.next();
        System.out.printf("%s, Sum of %d & %2.1f is %2f%n",str , num1, num2, num1+num2);
        in.close();
    }
}
