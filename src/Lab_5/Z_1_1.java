package Lab_5;

public class Z_1_1 {
    public static void main(String[] args){
        int [] Array = {1, 2, 3, 7, 4, 5, 8, 48, 4, 46, 9, 7, 14, 54, 65, 74, 20};
        for(int a:Array){
            System.out.println(a+" ");
        }
        for(int i = 0;i<Array.length;i++)
        {
            if(Array[i]>Array[i+1]) {
                System.out.println("A[" + (i + 1) + "] = " + Array[i + 1]);
            }
        }
    }
}
