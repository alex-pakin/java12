package ru.netology.domain;

public class Smartphone extends Product {

    private String manufacturer;

    public Smartphone (int id, String name, int price, String manufacturer ) {
        super.id = id;
        super.name = name;
        super.price = price;
        this.manufacturer = manufacturer;
    }

}
