package Lab2.Lab_2_Lapts;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Z1_1 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = pr.nextDouble();
        System.out.println("y = " + (((x-7)<0)? "Функция не определена" : sqrt(x+9)));
    }
}
