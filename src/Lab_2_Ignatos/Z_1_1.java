package Lab_2_Ignatos;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Z_1_1 {
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);
        System.out.print("VVedite x: ");
        double x = per.nextDouble();
        System.out.println("y = " + (((x+9)<0)? "Функция не определена" : sqrt(x+9)));
    }
}
