package com.company;

public class Trousers extends ClothingItem {
    public Trousers(String name,String brand, String size, String color) {
        super("com.company.Trousers",name, brand, size, color,29.99);
        try{
            if (!(Integer.parseInt(size)<42) && !(Integer.parseInt(size)<66) && !(0==(Integer.parseInt(size)%2))){
                System.out.println("Size not Valid!");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Value is not valid-"+e.getMessage());
        }
    }
}
