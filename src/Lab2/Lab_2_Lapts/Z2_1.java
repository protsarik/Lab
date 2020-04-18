package Lab2.Lab_2_Lapts;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Z2_1 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.print("Введи А: ");
        float a = pr.nextFloat();
        System.out.print("Введи B: ");
        float b = pr.nextFloat();
        System.out.print("Введи H: ");
        float h = pr.nextFloat();
        System.out.println("[" + a + ";" + b + "] " + "h = " + h);
        double x=a, y=0;
        do {
            y = (x-2)/(pow(x,2)+4);
            System.out.println("y("+ x + ") = " + y);
            x += h;
        }
        while (x<=b);
    }
}
