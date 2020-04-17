package Lab_5;

public class p2 {
    public static void main(String[] args) {
        int array[][] = {
                {180, 80},
                {153, 53},
                {192, 95}};
        for (int[] innerArrayRost : array) {
            for (int outArrayVes : innerArrayRost) {
                if (outArrayVes - 100 == array[0][1]) {
                    System.out.println(outArrayVes);
                }
            }
        }
    }
}
