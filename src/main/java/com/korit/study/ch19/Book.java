package com.korit.study.ch19;

import java.util.Objects;

public class Book {
    private String model;
    private String color;

    public Book(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof  Car)) return false;
//        Car car = (Car) o;
//
////        if (!(o instanceof Car car)) return false;
//        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o.getClass() != Book.class)) return false;

        Book car = (Book) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }
}
