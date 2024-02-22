package ru.fafurin.lesson3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Урок 3. Введение в StreamApi, создание потока данных
public class Main {
    public static void main(String[] args) {
// Используя Stream вам необходимо объединить данные три строки
// “I”, “LOVE”, “JAVA” вы создаете новый поток из простых строк,
// а затем собираете их в одну при помощи метода collect()
        System.out.println(Stream.of("I", "LOVE", "JAVA").collect(Collectors.joining(" ")));
    }
}
