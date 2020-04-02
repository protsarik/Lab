package Lab3;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Primer_4 {
    public static void main(String[] args) {
        try {
            System.out.println("Start of the main logic");
            System.out.println("Try opening a file...");
            Scanner in = new Scanner(new File("src/Lab3/text.txt"));
            System.out.println("File Found, processing the file ... ");
            System.out.println("End of the main logic");
        } catch (FileNotFoundException ex) {
            System.out.println("FILE Not Found caught...");
        } finally {
            System.out.println("Tralyalya");
        }
        System.out.println("After try-catch-finally, life goes on...");
    }
}

