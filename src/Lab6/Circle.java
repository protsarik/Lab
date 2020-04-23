package Lab6;

public class Circle {
    //    Описать объект «круг» в виде класса «circle». Свойства: радиус. Методы: ввод, вывод
//    значений свойств, вычисление длины окружности. Использовать созданный класс для
//    написания программы вычисления длины окружности по заданному значению радиуса.
    private double radius;

    public Circle() {
    }

    public double getRadius() {
        return this.radius;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    public double getLength() {
        double length = 2 * Math.PI * getRadius();
        return length;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        double r =  c1.setRadius(12.1);
        System.out.printf("Радиус равен:%2.2f", c1.getLength());
    }
}
