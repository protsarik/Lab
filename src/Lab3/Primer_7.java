package Lab3;
import javax.swing.JOptionPane;

public class Primer_7 {
    public static void main(String[] args){
        String radiusStr;
        double radius, area;
        // чтение данных из диалогового окна ввода в перем radiusStr
        radiusStr = JOptionPane.showInputDialog("Введите радиус круга");
        radius = Double.parseDouble(radiusStr);//преобразование String в Double
        area = radius*radius*Math.PI;
        System.out.println("Площадь = " + area);
    }
}
