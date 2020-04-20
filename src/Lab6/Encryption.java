package Lab6;

import java.util.Scanner;

//    В файле находится текст. В первое строке текста находится кодовое слово,
//    позволяющее определить, каким алгоритмом зашифрован текст. Текст может быть зашифрован
//    одним из алгоритмов : «А1» и «А2».
//    Алгоритм А1. Два соседних символа меняются местами.
//    Алгоритм А2. Слова записаны в обратном порядке.
//    Написать программу позволяющую зашифровывать и расшифровывать тексты.
public class Encryption {
    private String text;

    public Encryption(String textIn) {
        text = textIn;
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

    public String Encrypt() {

        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Encryption crypt = new Encryption(text);
        text = crypt.CryptA1();
        System.out.println(text);
    }
}