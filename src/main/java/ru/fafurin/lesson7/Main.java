package ru.fafurin.lesson7;

import java.util.ArrayList;
import java.util.Arrays;

// Урок 7. Операции сведения, reduce
public class Main {
    public static void main(String[] args) {
// Вам нужно создать класс “Students” с полями “класс” и “оценка”, и попробовать
// вычислить средний балл у студентов при помощи различных метода (reduce, min/max и
// т.д.)
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("student1", new int[]{3,4,3,4,5,3,5}));
        students.add(new Student("student2", new int[]{4,4,3,4,5,3,5}));
        students.add(new Student("student3", new int[]{3,2,3,4,5,4,5}));
        students.add(new Student("student4", new int[]{5,4,3,4,5,3,5}));
        students.add(new Student("student5", new int[]{3,4,5,4,2,3,3}));

        double average = students.stream().
                map(s-> Arrays.stream(s.grades).average().getAsDouble()).
                reduce(Double::sum).get() / students.size();

        System.out.println(String.format("%.2f", average));

    }
}

class Student {
    String name;
    int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
}
