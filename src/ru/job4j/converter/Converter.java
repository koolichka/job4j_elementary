package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70; // формула перевода рублей в евро
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70; // формула перевода евро в рубли
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; // формула перевода рублей в доллары
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60; // формула перевода доллара в рубли
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float rubleE = Converter.euroToRuble(2);
        System.out.println("2 euro are  " + rubleE + " rubles");
        float rubleD = Converter.dollarToRuble(2);
        System.out.println("2 dollar are  " + rubleD + " rubles");

    }
}
