package ГОСЫ;

import java.util.Scanner;

import static java.lang.Math.abs;

public class HardVersionOne {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int sizeOfArray = enter();
        int[] arrayForNumber = new int[sizeOfArray];
        input(arrayForNumber);
        output(arrayForNumber);
        decision(arrayForNumber);
    }

    //часть кода предназначенная для заполнения массива
    public static int enter() {
        int sizeOfArray;
        do {
            System.out.println("Введи размер масива(положительное число):");
            while (!in.hasNextInt()) {
                System.out.println("Это не число!!!");
                in.next();
            }
            sizeOfArray = in.nextInt();
        } while (sizeOfArray <= 0);
        return sizeOfArray;
    }

    public static void input(int arrayForNumber[]) {
        System.out.println("Введи элементы массива");
        for (int i = 0; i < arrayForNumber.length; i++) {
            while (!in.hasNextInt()) {
                System.out.println("Это не число!!!");
                in.next();
            }
            arrayForNumber[i] = in.nextInt();
        }
    }

    public static void output(int arrayForNumber[]) {
        System.out.println("Состав массива:");
        for (int i = 0; i < arrayForNumber.length; i++) {
            System.out.print(arrayForNumber[i] + "    ");
        }
        System.out.println();
    }

    //часть кода для решения задачи
    public static void decision(int arrayForNumber[]) {
        int min = abs(arrayForNumber[0]);
        int arrayElement=0;
        int minIndexElement =0;
        for (int step = 0; step < arrayForNumber.length; step++) {
            arrayElement+=1;
            if (abs(arrayForNumber[step]) < min) {
                minIndexElement =arrayElement;
            }
        }
        result(minIndexElement, arrayForNumber);

    }

            public static void result(int minIndexElement, int arrayForNumber[]) {
        int sum=0;
                for(int step = minIndexElement; step<arrayForNumber.length; step++){
                  sum+=arrayForNumber[step];
                }
                System.out.println("Сумма равна = "+sum + "    Начиная с элемента " +arrayForNumber[minIndexElement]);
            }
}
