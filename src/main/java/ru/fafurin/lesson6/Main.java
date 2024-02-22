package ru.fafurin.lesson6;

import java.util.ArrayList;

// Урок6.Перебор и группировка (map)
public class Main {
    public static void main(String[] args) {
// Необходимо вывести большими буквами названия всех продуктов из магазина электроники, написанного на уроке.
        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add(new Product("product1", 1231));
        catalog.add(new Product("product2", 12131));
        catalog.add(new Product("product3", 121));

        catalog.stream().map(product -> product.title.toUpperCase()).forEach(System.out::println);
    }
}

class Product {
    String title;
    int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
