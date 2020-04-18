package Lab5;

public class primer_1 {
    public static void main(String[] args){
        int[] marks = {74,43,58,60,90,64,70};
        int sum = 0;
        int count = marks.length;
        for(int i=0;i<count;i++){
            sum += marks[i];
        }
        double mean = sum/count;
        System.out.printf("mean is %2f", mean);
    }
}
