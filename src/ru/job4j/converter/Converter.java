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
        float in = 140;
        float inR = 2;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        float expectedRTD = 2.3333333F;
        float outRTD = Converter.rubleToDollar(in);
        boolean passedRTD = expectedRTD == outRTD;
        System.out.println("140 rubles are 2.3333333 dollar. Test result : " + passed);

        float expectedETR = 140;
        float outETR = Converter.euroToRuble(inR);
        boolean passedETR = expectedETR == outETR;
        System.out.println("2 euro are  140 rubles. Test result : " + passedETR);

        float expectedDTR = 120;
        float outDTR = Converter.dollarToRuble(inR);
        boolean passedDTR = expectedDTR == outDTR;
        System.out.println("2 dollar are  120 rubles. Test result : " + passedDTR);

    }
}
