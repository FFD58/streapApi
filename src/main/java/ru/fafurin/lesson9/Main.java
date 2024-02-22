package ru.fafurin.lesson9;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Урок 9. Преобразование (collect)
public class Main {
    public static void main(String[] args) {
// Задание про телефоны с урока
        // разделить телефоны на дешевые, средней стоимости и дорогие

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Very cheap phone", 23921));
        phones.add(new Phone("Simple phone", 53548));
        phones.add(new Phone("Very expensive phone", 89220));
        phones.add(new Phone("Cheap phone", 33789));
        phones.add(new Phone("Expensive phone", 63016));

        Stream<Phone> phoneStream = phones.stream();
        double average = phones.stream().mapToInt(p -> p.price).average().orElse(0);
        System.out.println(
                phoneStream.collect(Collectors.groupingBy(phone -> {
                    if (phone.price < average) return "Дешевые телефоны";
                    else if (phone.price > average - 5000 && phone.price < average + 5000) return "Телефоны средней ценовой категории";
                    else return "Дорогие телефоны";
                }, Collectors.mapping(Phone::getTitle, Collectors.toList())))
        );
    }
}

class Phone {
    String title;
    int price;

    public Phone(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
