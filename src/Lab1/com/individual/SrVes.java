package Lab1.com.individual;

import javax.swing.JOptionPane;

public class SrVes {
    public static void main(String[] args) {
        double vesX;
        double vesY;
        double vesZ;
        String ves = JOptionPane.showInputDialog("Введите вес первого человека");
        vesX = Double.parseDouble(ves);
        ves = JOptionPane.showInputDialog("Введите вес второго человека");
        vesY = Double.parseDouble(ves);
        ves = JOptionPane.showInputDialog("Введите вес третьего человека");
        vesZ = Double.parseDouble(ves);
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


    }
}
