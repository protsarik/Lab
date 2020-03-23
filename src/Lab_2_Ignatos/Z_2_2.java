package Lab_2_Ignatos;
import java.util.Scanner;

public class Z_2_2 {
    public static void main(String[] args){
        Scanner per = new Scanner(System.in);
        System.out.print("Vvedite nach summu v rub: A = ");
        double A = per.nextDouble();
        System.out.print("Vvedite konech summu v rub: C = ");
        double C = per.nextDouble();
        System.out.print("Vvedite % godovyh: x = ");
        double X = per.nextDouble();

        double Z = A; // присваиваем начальное А некой переменной z для наращивания прибыли;
        int i = 0;
        while(Z <= C)
        {
            Z = Z * (1+(X/100));
            i++;
        }
        System.out.println("Summa s % prevysit C cherez " + i + " let");
        System.out.println("Konech summa na schete cherez " + i + " let = " + Z);
    }
}
