package com.company;

import com.company.ClothingItem;

public class Shoes extends ClothingItem {

    public Shoes(String name,String brand, String size, String color) {
        super("Shoes",name, brand, size, color, 59.99);
        try{
            if (Integer.parseInt(size)<38 && Integer.parseInt(size)>46 ){
                System.out.println("Size iz not valid");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Value is not valid-"+e.getMessage());
        }

    }
}
