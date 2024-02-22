package ru.fafurin.lesson5;

import java.util.ArrayList;

// Урок 5. Выборка (skip and limit)
public class Main {
    public static void main(String[] args) {
// У вас есть список моделей смартфонов, iPhone 6 S", "Lumia 950", "Samsung
// Galaxy S 6", "LG G 4", "Nexus 7", вам нужно вывести в консоль названия двух моделей
// пропустив при этом первый бренд при помощи метода skip и limit
        ArrayList<String> phones = new ArrayList<>();
        phones.add("iPhone 6S");
        phones.add("Lumia 950");
        phones.add("Samsung Galaxy S6");
        phones.add("LG G4");
        phones.add("Nexus 7");

        phones.stream().skip(1).limit(2).forEach(System.out::println);

    }
}
