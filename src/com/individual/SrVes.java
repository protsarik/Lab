package com.individual;

import java.util.Scanner;

public class SrVes {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner ves1 = new Scanner(System.in);
        System.out.print("VVedi ves X: ");
        double vesX = ves1.nextDouble();

        Scanner ves2 = new Scanner(System.in);
        System.out.print("VVedi ves Y: ");
        double vesY = ves2.nextDouble();

        Scanner ves3 = new Scanner(System.in);
        System.out.print("VVedi ves Z: ");
        double vesZ = ves3.nextDouble();

        var vesP2 = vesY / 40;
        var vesP3 = vesZ/16.38;
        double srZnPudr= (vesX+vesP2+vesP3)/3;

        var vesF1 = vesX*40;
        var vesF3 = vesZ*2.44;
        double srZnFut= (vesF1+vesY+vesF3)/3;

        var vesK1 = vesX*16.38;
        var vesK2 = vesY/2.44;
        double srZnKg= (vesK1+vesK2+vesZ)/3;


        System.out.println(srZnPudr + " pudov");
        System.out.println(srZnFut + " futov");
        System.out.println(srZnKg + " kg");
=======
        Scanner ves = new Scanner(System.in);
        System.out.print("VVedi ves X: ");
        double vesX = ves.nextDouble();
        System.out.print("VVedi ves Y: ");
        double vesY = ves.nextDouble();
        System.out.print("VVedi ves Z: ");
        double vesZ = ves.nextDouble();

        var vesP2 = vesY / 40;
        var vesP3 = vesZ / 16.38;
        double srZnPud = (vesX + vesP2 + vesP3) / 3;

        var vesF1 = vesX * 40;
        var vesF3 = vesZ * 2.44;
        double srZnFut = (vesF1 + vesY + vesF3) / 3;

        var vesK1 = vesX * 16.38;
        var vesK2 = vesY / 2.44;
        double srZnKg = (vesK1 + vesK2 + vesZ) / 3;

        System.out.printf("%2.2f средний вес в пудах,\n", srZnPud);
        System.out.printf("%2.2f в футах,\n", srZnFut);
        System.out.printf("%2.2f в килограммах.\n", srZnKg);
>>>>>>> LICE-NIKITA

    }
}
