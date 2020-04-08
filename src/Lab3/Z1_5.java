package Lab3;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Z1_5 {
    public static void main(String[] args) {
        String xStr;
        double x, san, dume;

        xStr = JOptionPane.showInputDialog("Введите X");
        x = Double.parseDouble(xStr);
        san = x * 100;
        dume = x * 39.3700787;
        System.out.println("znach v san: " + san + " sm");
        System.out.println("znach v dumah: " + dume + " dume");
    }
}
