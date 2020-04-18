package Lab_5;

public class p2 {
    public static void main(String[] args) {
        int[][] array = {{180, 80}, {150, 100}, {190, 50}};
        int p = 0;
        int count = 0;
        System.out.println("Следующие кандидаты не подходят:");

        for (int[] innerArrayRost : array) {
            count++;
            for (int outArray : innerArrayRost) {

                if (outArray < (p - 100) - 3 || outArray > (p - 100) + 3 && p > outArray) {

                    System.out.println("" + count);

                }
                p = outArray;
            }
        }
    }
}

