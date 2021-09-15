package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15; // формула идеального веса мужчины
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15; // формула идеального веса женщины
        return rsl;
    }

    public static void main(String[] args) {
        short height = 170;
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman " + height + " is " + woman);
    }
}
