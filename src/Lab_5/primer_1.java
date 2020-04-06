package Lab_5;

public class primer_1 {
    public static void main(String[] args){
        int[] marks = {74,43,58,60,90,64,70};
        int sum = 0;
        int count = marks.length;
        for(int i=0;i<count;i++){
            sum += marks[i];
        }
        mean = (double)sum/count;
        System.out.println("mean is %2f%n", mean);
    }
}
