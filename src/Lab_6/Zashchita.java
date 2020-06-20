package Lab_6;

import java.util.Scanner;

public class Zashchita {
    public int gov; public int mile; public int vin;

    public void InputPer(){
        Scanner a = new Scanner(System.in);
        System.out.println("введите gov");
        gov = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("введите mile");
        mile = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("введите vin");
        vin = c.nextInt();
    }
    public void OutputPer(){
        System.out.println("gov = " + gov + "\nmile = " + mile + "\n5" +
                "vin = " + vin); }

    public static void main(String[] args){
        Zashchita Z = new Zashchita();
        Z.InputPer();
        Z.OutputPer();
    }

}