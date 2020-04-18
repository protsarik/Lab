package Lab2.Lab_2_Lapts;
import java.util.Scanner;

public class Z1_2 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.print("Введите A руб: ");
        double a = pr.nextDouble();
        System.out.print("Введите B руб: ");
        double b = pr.nextDouble();
        System.out.print("Введите С руб: ");
        double c = pr.nextDouble();

        if(a<b){
            if (a<c) { System.out.println("Самый дешевый это А = " + a + " Руб"); }
            else { System.out.println("Самый дешевый это С = " + c + " Руб"); }
        }
        else if (b<c) { System.out.println("Самый дешевый это B = " + b + " Руб"); }
        else { System.out.println("Самый дешевый это С = " + c + " Руб"); }

    }
}
