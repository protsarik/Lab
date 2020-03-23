package Lab_2_Ignatos;
import java.util.Scanner;

public class Z_1_3 {
    public static void main(String[] args){
    Scanner per = new Scanner(System.in);
    System.out.print("Vvedi L: ");
    int L = per.nextInt();
    // System.out.println("L = " + L);
    System.out.println("Vvedi num from 1 to 5");
    System.out.println("1 - Dm");
    System.out.println("2 - Km");
    System.out.println("3 - M");
    System.out.println("4 - Mm");
    System.out.println("5 - Sm");
    int k = per.nextInt();
    double z;
    switch (k){
        case 1: System.out.println(L + " Dm = " + L*0.1 + " M"); break;
        case 2: System.out.println(L + " Km = " + L*1000 + " M"); break;
        case 3: System.out.println(L + " M = " + L*1 + " M"); break;
        case 4: System.out.println(L + " Mm = " + L*0.001 + " M"); break;
        case 5: System.out.println(L + " Sm = " + L*0.01 + " M"); break;
        default: System.out.println("Error!!!");
    }
    }
}
