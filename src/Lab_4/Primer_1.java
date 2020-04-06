package Lab_4;

public class Primer_1 {
    public static void main(String[] args) {
        // Объявление строк
        String firstStr = "fxxjwexxwexxwdwx";
        String secondStr = new String("Текстовый текст");
    /*    //вычисление длины строки
        System.out.println("Длина строки firstStr " + firstStr.length());
        //поиск подстроки в строке
        String findText = "текст";
        System.out.println("В строке firstStr " + ((firstStr.indexOf(findText) > 0) ? "есть" : "отсутствует") + "слово" + findText);
        //замена символа в строке
        String newStr = firstStr.replace(" ", "+");
        System.out.println("Новая строка " + newStr);
        //сравнение строк
        System.out.println("Строки firstStr и secondStr ");
        if (firstStr.equals(secondStr)) System.out.println("совпадают");
        else System.out.println("не совпадают");
        // сколько раз встречается заданный символ в строке */
        int count = 0;
        for(int i=0; i<firstStr.length();i++){
            if ((firstStr.charAt(i) == 'x') && (firstStr.charAt(i+1) == firstStr.charAt(i))) count++;
        System.out.println("Count = " + count);
        }
        System.out.println("Символ xx встречается в firstStr " + count + " раз");
    }
}
