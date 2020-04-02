package Lab3;

import java.util.Scanner;

public class Primer_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String with Space: ");
        String str = in.nextLine();
        System.out.printf("%s\n", str);
        in.close();
    }
}
