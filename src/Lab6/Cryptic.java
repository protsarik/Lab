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
        return this.text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст:");
        String text = in.nextLine();
        System.out.print("Введите номер метода шифрования:");
        int MethodCrypt = in.nextInt();

        switch(MethodCrypt){
            case 1:Cryptic crypt = new Cryptic(text);
                text = crypt.CryptA1();break;
            case 2:Cryptic crypt2 = new Cryptic(text);
                text = crypt2.CryptA2();break;
        }
        System.out.println(text);
        try {
            Formatter out = new Formatter(new File("src/Lab6/crypt.txt"));
            out.format(text);
            out.close();
            System.out.println("Запись выполнена.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}