package Lab3;
import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;

public class Primer_6 {
    public static void main(String[] args){
        try {//используем класс Formatter для записи форматированного вывода в текстовый файл
            Formatter out = new Formatter(new File("out.txt"));
            // записываем в файл метода format()
            int n1 = 1234;
            double n2 = 55.66;
            String name = "Tanya";
            out.format("Hi %s,%n", name);
            out.format("The sum of %d and %.2f is %.2f%n", n1,n2,n1+n2);
            out.close();//закрыть файл
            System.out.println("Done");
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace(); // печать трассировки стека
        }
    }
}
