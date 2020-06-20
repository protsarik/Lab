package ГОСЫ;

import java.util.Scanner;

public class hardVersionOne {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int sizeOfArray = enter();
        int[] arrayForNumber = new int[sizeOfArray];
        input(arrayForNumber);
        output(arrayForNumber);
        comparison(arrayForNumber);
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

    public static void output(int arrayForNumber[]) {
        System.out.println("Состав массива:");
        for (int i = 0; i < arrayForNumber.length; i++) {
            System.out.print(arrayForNumber[i] + "    ");
        }
        System.out.println();
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

    //часть кода для решения задачи
    public static void comparison(int arrayForNumber[]) {
        int[] valueArray = new int[3];
        int[] numberElement = new int[3];
        int k = 0;
        for (int step = 0; step < arrayForNumber.length; step++) {
            if (arrayForNumber[step] > 15) {
                valueArray[k] = arrayForNumber[step];
                numberElement[k] = step + 1;
                k = k + 1;
            }
            if (k > 2) {
                break;
            }
        }
        result(k, valueArray, numberElement);
    }

    public static void result(int k, int valueArray[], int numberElement[]) {
        if (k == 3) {
            for (int step = 0; step < 3; step++) {
                System.out.println("value=" + valueArray[step] + "\t number" + numberElement[step]);
            }
        } else if (k == 0) {
            System.out.println("не найдены");
        } else System.out.println("меньше трех элементов");
    }
}
