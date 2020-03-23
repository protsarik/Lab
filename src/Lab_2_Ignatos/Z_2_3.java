package Lab_2_Ignatos;
import java.util.Scanner;

public class Z_2_3 {
    public static void main(String[] args){
        Scanner per = new Scanner(System.in);
        System.out.print("Vvedite otrezok ot A do B : ");
        System.out.print("Vvedite A: ");
        int A = per.nextInt();
        System.out.print("Vvedite B: ");
        int B = per.nextInt();
        int i;
        for(i = A; i <= B; i++);
        {
            if ( i % 7 == 0)
            {
                System.out.println(i);
            }
           else System.out.println("Chisel kratnyh 7 net!!!");
        }
    }
}
