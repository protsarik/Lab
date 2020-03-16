package com.company;

import java.util.Scanner;

public class ImportScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer:");
        int number= in.nextInt();
        System.out.print("You have a integer "+ number);
        }
    }