package ru.fafurin.lesson4;

import java.util.Random;
import java.util.stream.IntStream;

// Урок 4. Фильтрация (filter), перебор (forEach), Сортировка (sort)
public class Main {
    public static void main(String[] args) {
// Попробуйте создать поток рандомных чисел от -10 до 10,
// отфильтруйте их так, чтобы остались только положительные, отсортируйте по
// возрастанию и выведите их в консоль
        Random random = new Random();

        IntStream.generate(()->random.nextInt(-10,11)).limit(10).filter((i) -> i > 0).sorted().forEach(System.out::println);

    }
}
