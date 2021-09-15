package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1)); // формула высоты
        double l = h * k;             // формула длины
        double rsl = l * h;           // формула площади
        return rsl;
    }

    public static void main(String[] args) {
        double p = 10; // периметр
        double k = 3; // коэффициент
        double s = 2; // площадь
        double result1 = SqArea.square(p, k);
        System.out.println("p = " + p + ", k = " + k + ", s = " + s + ", real = " + result1);
    }
}
