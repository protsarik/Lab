package Lab_2_Ignatos;
import java.util.Scanner;

public class Z_2_1 {
    public static void main(String[] args){
    Scanner per = new Scanner(System.in);
    System.out.print("Vvedi A which < B: ");
    float a = per.nextFloat();
    System.out.print("Vvedi B which > A: ");
    float b = per.nextFloat();
    System.out.print("Vvedi H: ");
    float h = per.nextFloat();
    System.out.println("[" + a + ";" + b + "] " + "h = " + h);
    double x=a, y=0;
        do {
            y = Math.cos(x) + 5;
            System.out.println("y("+ x + ") = " + y);
            x += h;
        }
        while (x<=b);
    }
}
