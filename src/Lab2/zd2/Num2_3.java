package Lab2.zd2;

import java.util.Scanner;

public class Num2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество повторений");
        int n = in.nextInt();
        int sum = 0;
        int chislo = 0;
        for (int i = 1; n >= i; i++) {
            if (n % 2 == 0){
                return;
            }
            else if (n < 9) {
                return;
            } else if (n > 100) {
                return;
            } else {
                sum += chislo;
            }
        }
        System.out.print(sum);
    }
}
