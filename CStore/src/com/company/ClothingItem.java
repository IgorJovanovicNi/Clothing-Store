package com.company;

public class ClothingItem {
    String type;
    String name;
    String brand;
    String size;
    String color;
    double price;

    public ClothingItem(String type,String name, String brand, String size, String color, double price) {
        this.type=type;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "com.company.ClothingItem{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
