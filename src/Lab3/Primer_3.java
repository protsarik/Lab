package Lab3;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Primer_3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
