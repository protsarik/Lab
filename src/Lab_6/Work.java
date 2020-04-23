package Lab_6;
// На предприятии сотрудники могут работать в штате либо по договору подряда. Для штатных сотрудников заработная плата назначается исходя из оклада,
// размера надбавки (% от оклада) и премии, а также в случае отсутствия на работе (отпуск болезнь и др.) оклад выплачивается пропорционально отработанным дням.
// Для сотрудников, работающих по договору подряда заработная плата начисляется исходя из ставки за час и количества отработанных.
//Написать программу для начисления заработной платы и формирования ведомости для выдачи заработной платы.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Work {
    private double oklad;
    private double nadbabka;
    private double premiya;
    private int time = 176;
    private double Z;
    private double stavka;


    public Work(double okl, double nadb, double prem, int times) {
        oklad = okl;
        nadbabka = nadb;
        premiya = prem;
        time = times;
    }

    public double Zarplata() {
        if (time == 176) {
            Z = oklad + oklad * nadbabka + premiya;
        } else {
            Z = (oklad + oklad * nadbabka) / 176 * time + premiya;
        }
        return Z;
    }

    public Work(double stavka, int time) {
        this.stavka = stavka;
        this.time = time;
    }

    public double ZP() {
        Z = stavka * time;
        return Z;
    }

    public double getZP(){
        return Z;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Выберите: 1 - штатник 2 - подрядчик 3 - ведомость за ЗП");
        Scanner s = new Scanner(System.in);
        int ss = s.nextInt();
        switch (ss) {
            case 1:
                Work w1 = new Work(10000, 0.15, 5000, 170);
                System.out.println("Zш = " + w1.Zarplata());
                try {
                    Formatter out = new Formatter(new File("src/Lab_6/work.txt"));
                    out.format(String.valueOf("ш - " + w1.getZP() + "\n"));
                    out.close();
                    System.out.println("Запись выполнена.");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                break;
            case 2:
                Work w2 = new Work(10, 176);
                System.out.println("Zп = " + w2.ZP());
                try {
                    Formatter out = new Formatter(new File("src/Lab_6/work.txt"));
                    out.format(String.valueOf("п - " + w2.getZP() + "\n"));
                    out.close();
                    System.out.println("Запись выполнена.");
                }  catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
                break;
            case 3:
                try {
                    Scanner read = new Scanner(new File("src/Lab_6/work.txt"));
                    String text = read.nextLine();
                    System.out.println(text);
                    read.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

        }


    }
}
