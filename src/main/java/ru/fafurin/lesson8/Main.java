package ru.fafurin.lesson8;

import java.util.OptionalInt;
import java.util.stream.IntStream;

// Урок 8. Optional
public class Main {
    public static void main(String[] args) {
// Вам необходимо из массива “-10 – 10” взять числа меньше 10,
// которые получатся в результате функции x2 – 5x – 10
// и вывести квадрат максимального.

        OptionalInt max = IntStream.range(-10, 11)
                .map(x -> x * x - 5 * x - 10)
                .filter(x -> x < 10)
                .max();

        max.ifPresentOrElse(
                (m) -> System.out.println(m * m),
                () -> System.out.println("Number was not found")
        );
    }
}
