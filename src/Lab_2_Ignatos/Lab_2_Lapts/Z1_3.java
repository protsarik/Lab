package Lab_2_Ignatos.Lab_2_Lapts;
import java.util.Scanner;

public class Z1_3 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.print("Введи число k: ");
        int k = pr.nextInt();
        int m = k % 10;
        switch (m) {
            case 1: System.out.println("Последняя цифра квадрата числа 1 это 1");break;
            case 2: System.out.println("Последняя цифра квадрата числа 2 это 4");break;
            case 3: System.out.println("Последняя цифра квадрата числа 3 это 9");break;
            case 4: System.out.println("Последняя цифра квадрата числа 4 это 6");break;
            case 5: System.out.println("Последняя цифра квадрата числа 5 это 5");break;
            case 6: System.out.println("Последняя цифра квадрата числа 6 это 6");break;
            case 7: System.out.println("Последняя цифра квадрата числа 7 это 9");break;
            case 8: System.out.println("Последняя цифра квадрата числа 8 это 4");break;
            case 9: System.out.println("Последняя цифра квадрата числа 9 это 1");break;
            case 0: System.out.println("Последняя цифра квадрата числа 0 это 0");break;
            default: System.out.println("Error!!!");
        }
    }
}
