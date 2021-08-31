package ru.job4j.calculator;

import java.util.concurrent.Callable;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}


/*
 *//*int one = 1;
        int two = 2;
        int result = one + two;
        System.out.println(result);
        one = 10;
        two = 11;
        result = one + two;
        System.out.println(result);*//*


 *//*int size = 10;
        size = size + 100;
        size = size - 5;
        System.out.println(size);*//*
    }
}*/
