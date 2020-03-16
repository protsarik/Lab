package com.individual;

import java.util.Scanner;

public class SrVes {
    public static void main(String[] args) {
        Scanner ves1 = new Scanner(System.in);
        System.out.print("VVedi ves X: ");
        double vesX = ves1.nextDouble();
        Scanner ves2 = new Scanner(System.in);
        System.out.print("VVedi ves Y: ");
        double vesY = ves2.nextDouble();
        Scanner ves3 = new Scanner(System.in);
        System.out.print("VVedi ves Z: ");
        double vesZ = ves3.nextDouble();
        System.out.println(vesX + "pudov");
        System.out.println(vesY + "futov");
        System.out.println(vesZ + "kg");
    }
}
