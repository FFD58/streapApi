package ru.fafurin.lesson2;

import java.util.function.Function;

// Урок 2. Лямбда-выражения, функциональные интерфейсы
public class Main {
    public static void main(String[] args) {
// Написать лямбда выражение, которое принимает на вход число и возвращает
// значение “Положительное число”, “Отрицательное число” или “Ноль”. Используем
// функциональный интерфейс Function.
        Function<Integer, String> function = (number) -> {
            if (number > 0) return "Положительное число";
            else if (number < 0) return "Отрицательное число";
            else return "Ноль";
        };

        System.out.println(function.apply(0));
        System.out.println(function.apply(-123));
        System.out.println(function.apply(123));
    }
}
