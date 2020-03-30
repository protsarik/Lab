package Lab3;
import java.util.Scanner;
public class Primer_1 {
    public static void main(String[] args){
        int num1; double num2; String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num1 = in.nextInt();
        System.out.print("Enter a double: ");
        num2 = in.nextDouble();
        System.out.print("Enter a String: ");
        str = in.next(); // чтение строки
        System.out.printf("%s, Sum of %d & %2f is %2f%n", str, num1, num2, num1 + num2);
        in.close();//закрыть поток ввода
    }
}
