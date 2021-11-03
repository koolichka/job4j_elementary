package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            while (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
