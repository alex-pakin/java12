package ru.netology.domain;

public class Book extends Product {

    private String author;

    public Book (int id, String name, int price,String author ) {
        super.id = id;
        super.name = name;
        super.price = price;
        this.author = author;
    }
}
