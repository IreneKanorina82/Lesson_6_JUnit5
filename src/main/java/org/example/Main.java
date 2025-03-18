package org.example;

public class Main {
    public static void main(String[] args) {

        numberFactorial(6);
        triangleSquare(2, 3);
        counterNumbers(918, 9, "/");
        compareNumbers(6, 6);
    }

    //факториал числа:
    public static void numberFactorial(int Number) {
        int newNumber = Number;
        for (int i = 1; i < Number; i++) {
            newNumber = newNumber * (Number - i);
        }
        System.out.println(newNumber);
    }

    //площадь треугольника: S=(a*h)/2
    public static void triangleSquare(int a, int h) {
        int S = (a * h) / 2;
        System.out.println("Площадь треугольника: " + S);
    }

    //арифметическое действие с двумя целыми числами (сложение, вычитание, деление и умножение):
    public static void counterNumbers(int a, int b, String sign) {
        switch (sign) {
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "+":
                System.out.println(a + b);
                break;
        }
    }

    //сравнение двух целых чисел:
    public static void compareNumbers(int a, int b) {
        if (a < b) {
            System.out.println(a + " < " + b);
        }
        if (a > b) {
            System.out.println(a + " > " + b);
        }
        if (a == b) {
            System.out.println(a + " = " + b);
        }
    }
}