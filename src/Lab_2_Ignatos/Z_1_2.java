package Lab_2_Ignatos;
import java.util.Scanner;

public class Z_1_2 {
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);
        System.out.print("VVedite x kg: ");
        double x = per.nextDouble();
        System.out.print("VVedite y kg: ");
        double y = per.nextDouble();
        System.out.print("VVedite z kg: ");
        double z = per.nextDouble();

            if(x>y){
                if (x>z) { System.out.println("X is the first"); }
                else { System.out.println("Z is the first"); }
            }
            else if (y>z) { System.out.println("Y the first"); }
            else { System.out.println("Z the first"); }
    }
}
