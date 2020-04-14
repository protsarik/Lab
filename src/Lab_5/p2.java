package Lab_5;

public class p2 {
    public static void main(String[] args){
        String firstStr = "156204542301546201654475200";
        int n = firstStr.length();
        int count = 0;
        for(int i=0; i<n;i++){
            if(firstStr.charAt(i) == '0') count++;}
        System.out.println("Количество 0 = " + count);
    }
    }
