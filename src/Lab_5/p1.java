package Lab_5;

public class p1 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 7, 4, 5, 8, 48, 4, 46, 9, 7, 14, 54, 65, 74, 20};
        for (int i : Array) {
            if (Array[i] > Array[i - 1]) {
                System.out.println("Элемент " + Array[i] + " меньше чем " + Array[i - 1]);
            }
        }
    }
}
