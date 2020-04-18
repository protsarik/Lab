package Lab4;

public class Primer_1 {
    public static void main(String[] args) {
        // Объявление строк
        String firstStr = "urifjie jkd. xxjkekxтекстkxfkkelekl";
        String secondStr = new String("xx");
        //вычисление длины строки
        System.out.println("Длина строки firstStr " + firstStr.length());
        //поиск подстроки в строке
        String findText = "текст";
        System.out.println("В строке firstStr " + ((firstStr.indexOf(findText) > 0) ? " есть " : " отсутствует") + " слово " + findText);
        //замена символа в строке
        String newStr = firstStr.replace(" ", "+");
        System.out.println("Новая строка " + newStr);
        //сравнение строк
        System.out.println("Строки firstStr и secondStr ");
        if (firstStr.equals(secondStr)) System.out.println("совпадают");
        else System.out.println("не совпадают");
        // сколько раз встречается заданный символ в строке
     int count = 0;
        for(int i=0; i<firstStr.length();i++){
            if(firstStr.charAt(i) == 'x') count++;}
        System.out.println("Символ е встречается в firstStr " + count + "раз");
    }
}
