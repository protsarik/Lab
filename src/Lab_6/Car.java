package Lab_6;

import java.util.Scanner;

public class Car{
    // Описать объект «автомобиль» в виде класса «car». Свойства: гос. номер, VIN, пробег. Методы: ввод, вывод значений свойств, увеличить пробег.
    // Использовать созданный класс для написания программы, позволяющей пользователю добавлять и просматривать пробег автомобиля
    private int gov;
    private double mile;
    private int vin;

    public Car(int gov, double mile, int vin){ this.gov = gov; this.mile = mile; this.vin=vin; }

    public int getGov() {return gov;}
    public double getMile() {return mile;}
    public int getVin() {return vin;}

    public void setGov(int gover) {gov = gover;}
    public void setMile(double probeg) {mile = probeg;}
    public void setVin(int vin) {this.vin = vin;}

    public double incMile(double pr) {
        mile += pr;
        return mile;
    }

    public static void main(String[] args){
        Car car1 = new Car(1928, 10000, 228);
        Scanner per = new Scanner(System.in);
        System.out.println("Введите на сколько увеличить пробег - ");
        double p = per.nextInt();
        System.out.println("Пробег до был - " + car1.getMile() + ", а после - " + car1.incMile(p));

    }

}
