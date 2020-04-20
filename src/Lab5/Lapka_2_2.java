package Lab5;

public class Lapka_2_2 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 0},
                {2, 100},
                {3, 50},
                {4, 0},
                {5, 22}};

        for (int i = 0; i < array.length; i++) {
            int number = 0;
            for (int x = 0; x < array[i].length; x++) {
                if (number != 0 && array[i][x] == 0) {
                    switch (number) {
                        case 1:
                            System.out.println("Нужно пополнить в ЦУМ");
                            break;
                        case 2:
                            System.out.println("Нужно пополнить в ГУМ");
                            break;
                        case 3:
                            System.out.println("Нужно пополнить в Немига");
                            break;
                        case 4:
                            System.out.println("Нужно пополнить в Центральный");
                            break;
                        case 5:
                            System.out.println("Нужно пополнить в Первомайский");
                            break;
                    }
                }
                number = array[i][x];
            }
        }
    }
}