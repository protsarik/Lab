package com.individual;

import java.util.Scanner;

public class Indi9 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("vvedi x: ");
        double x = w.nextDouble();

        double san = x * 100;
        double dume = x * 39.3700787;
        System.out.println("znach v san: " + san + " sm");
        System.out.println("znach v dumah: " + dume + " dume");
}
}
