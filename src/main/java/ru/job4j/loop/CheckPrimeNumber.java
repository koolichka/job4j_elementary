package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            int numberCheck = number % i;
            if (numberCheck == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
