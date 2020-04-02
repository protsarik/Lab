package Lab_2_Ignatos.Lab_2_Lapts;
import java.util.Scanner;

public class Z2_2 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.print("Введите начальную сумму в рублях: A = ");
        double A = pr.nextDouble();
        System.out.print("Введите конечную сумму в рублях: C = ");
        double C = pr.nextDouble();
        System.out.print("Введите % годовых: x = ");
        double X = pr.nextDouble();

        double Z = A; int i = 0;
        while(Z <= C)
        {
            Z = Z * (1+(X/100));
            i++;
        }
        System.out.println("Сумма с % превысит С через " + i + " let");
    }
}
