package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double p = 10;
        double k = 3;
        double s = 2;
        double result1 = SqArea.square(p, k);
        System.out.println("p = " + p + ", k = " + k + ", s = " + s + ", real = " + result1);
    }
}
