package ru.fafurin.lesson1;

import java.util.Scanner;
// Тема 1. Stream Api. Функциональное программирование в Java.
// Урок 1. Анонимные классы
public class Main {
    public static void main(String[] args) {

// Задание в рамках интерфейса java нужно создать калькулятор выполняющий 4
// основных арифметических функций, сложение, вычитание, деление,
// умножение, а также осуществить вывод на результатов на экран

        Calculator calculator = new Calculator() {
            @Override
            public void calc(int a, int b, String operator) {
                switch (operator) {
                    case "+" -> System.out.println(a + b);
                    case "-" -> System.out.println(a - b);
                    case "*" -> System.out.println(a * b);
                    case "/" -> System.out.println(a / b);
                }
            }
        };

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        calculator.calc(a,b, "+");
        calculator.calc(a,b, "-");
        calculator.calc(a,b, "*");
        calculator.calc(a,b, "/");
    }
}
