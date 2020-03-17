package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");
    }
}
class TwoNumberSum {

    public static void main(String[] args) {
        int num1=12;
        int num2=15;
        int sum= num1 + num2;
        System.out.print("Sum is:");
        System.out.println(sum);
    }
}
class HelloFormat {

    public static void main(String[] args) {
        System.out.printf("Hello%10d and %20s",8,"Hi!\n");
        System.out.printf("Hi, %s%4d\n","Hello",88);
        System.out.printf("Hello%d%4.2f\n",8,5.512);
        System.out.printf("Hi, %-80s&%3.3f\n","Hi",5.55996768);
        System.out.printf("%2.2fHi, Hi \n",5.5568);
    }
}

class ScannerNoImport {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter a integer:");
        int number= in.nextInt();
        System.out.print("You have a integer "+ number);
    }
}