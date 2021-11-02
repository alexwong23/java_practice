package com.example.experiments.service.Item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumableItemService implements ItemService {
    private String name;
    private String category;
    private Double price;

    private Logger log = LoggerFactory.getLogger(ConsumableItemService.class);

    public ConsumableItemService() {
        this.category = "Consumable";
    }

    public ConsumableItemService(String name, Double price) {
        this(); // constructor chaining
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

