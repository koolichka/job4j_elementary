package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDiffAndDiv(double first, double second) {
        return sum(diff(first, second), div(first, second));
    }

    public static double sumAll(double first, double second) {
        return sum(sum(first, second), multiply(first, second))
                + sum(diff(first, second), div(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления равен: " + sumDiffAndDiv(10, 20));
        System.out.println("Результат расчета суммы всех вычеслений равен: " + sumAll(10, 20));
    }
}