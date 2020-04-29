package Lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

//    В файле находится текст. В первое строке текста находится кодовое слово,
//    позволяющее определить, каким алгоритмом зашифрован текст. Текст может быть зашифрован
//    одним из алгоритмов : «А1» и «А2».
//    Алгоритм А1. Два соседних символа меняются местами.
//    Алгоритм А2. Слова записаны в обратном порядке.
//    Написать программу позволяющую зашифровывать и расшифровывать тексты.

public class Cryptic {
    private String text;

    public Cryptic(String textToCrypt) {
        text = textToCrypt;
    }

    public String CryptA1() {
        char[] ArrayWord = text.toCharArray();
        int n = ArrayWord.length;
        char temp;
        for (int i = 0; i < n - 1; i = i + 2) {
            temp = ArrayWord[i + 1];
            ArrayWord[i + 1] = ArrayWord[i];
            ArrayWord[i] = temp;
        }
        text = new String(ArrayWord);
        text = "A1 " + text;
        try {
            Formatter out = new Formatter(new File("src/Lab6/crypt.txt"));
            out.format(text);
            out.close();
            System.out.println("Запись выполнена.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return this.text;
    }

    public String CryptA2() {
        char[] ArrayWord = text.toCharArray();
        int n = ArrayWord.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = ArrayWord[n - i - 1];
            ArrayWord[n - i - 1] = ArrayWord[i];
            ArrayWord[i] = temp;
        }
        text = new String(ArrayWord);
        text = "A2 " + text;
        try {
            Formatter out = new Formatter(new File("src/Lab6/crypt.txt"));
            out.format(text);
            out.close();
            System.out.println("Запись выполнена.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return this.text;
    }

    public String Encrypt() {
        try {
            Scanner in = new Scanner(new File("src/Lab6/crypt.txt"));
            text = in.nextLine();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (text.startsWith("A1")) {
            text = text.substring(3);
            char[] ArrayWord = text.toCharArray();
            int n = ArrayWord.length;
            char temp;
            for (int i = 0; i < n - 1; i = i + 2) {
                temp = ArrayWord[i + 1];
                ArrayWord[i + 1] = ArrayWord[i];
                ArrayWord[i] = temp;
            }
            text = new String(ArrayWord);
        } else if (text.startsWith("A2")) {
            text = text.substring(3);
            char[] ArrayWord = text.toCharArray();
            int n = ArrayWord.length;
            char temp;
            for (int i = 0; i < n / 2; i++) {
                temp = ArrayWord[n - i - 1];
                ArrayWord[n - i - 1] = ArrayWord[i];
                ArrayWord[i] = temp;
            }
            text = new String(ArrayWord);
        } else System.out.println("Текст не зашифрован доступными методами");
        return text;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер метода (де-)шифрования:");
        System.out.println("1 -1-й алгоритм; 2 -2-й алгоритм; 3 -дешифровка.");
        int MethodCrypt = in.nextInt();
        String text = null;

        switch (MethodCrypt) {
            case 1:
                Scanner t = new Scanner(System.in);
                System.out.print("Введите текст:");
                text = t.nextLine();
                Cryptic crypt1 = new Cryptic(text);
                text = crypt1.CryptA1();
                break;
            case 2:
                Scanner v = new Scanner(System.in);
                System.out.print("Введите текст:");
                text = v.nextLine();
                Cryptic crypt2 = new Cryptic(text);
                text = crypt2.CryptA2();
                break;
            case 3:
                Cryptic encrypt = new Cryptic(text);
                text = encrypt.Encrypt();
                break;
        }
        System.out.println("Итоговый текст: " + text);
    }
}                       