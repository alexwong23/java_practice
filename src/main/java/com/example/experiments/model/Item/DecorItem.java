package com.example.experiments.model.Item;

public class DecorItem implements Item {
    private String name;
    private String category;
    private Double price;

    public DecorItem() {
        this.category = "Decor";
    }

    public DecorItem(String name, Double price) {
        this();
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nItem Name: " + this.name +
                "\nItem Category: " + this.category +
                "\nItem Price: " + this.price;
    }

    public String getName() {
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }
    public Double getPrice() {
        return this.price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
