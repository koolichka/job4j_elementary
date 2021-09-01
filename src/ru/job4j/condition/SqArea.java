package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k){
        double h = p / (2 * (k + 1)); // формула высоты
        double L = h * k;             // формула длины
        double rsl = L * h;           // формула площади
        return rsl;
    }

    public static void main(String[] args) {
        double p = 6; // периметр
        double k = 2; // коэффициент
        double s = 2; // площадь
        double result1 = SqArea.square(p, k);
        System.out.println("p = " + p + ", k = " + k + ", s = " + s + ", real = " + result1);
    }
}
