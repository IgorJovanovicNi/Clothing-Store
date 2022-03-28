package com.company;

import com.company.ClothingItem;

public class Shirts extends ClothingItem {

    public Shirts( String name, String brand, String size, String color) {
        super("Shirt", name, brand, size, color,15.99);
        if (size.equals("XS") || size.equals("S") || size.equals("M") ||
                size.equals("L") || size.equals("XL") || size.equals("2XL")){

        }else{
            System.out.println("Not Valid");
        }
    }

}
