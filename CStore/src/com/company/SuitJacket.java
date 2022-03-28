package com.company;

public class SuitJacket extends ClothingItem {

    public SuitJacket(String name, String brand, String size, String color) {
        super("Suit Jacket",name, brand, size, color,99.99);
        try{
            int s=Integer.parseInt(size);
            System.out.println(s);
            if ((s<42) || (s>66) || (s%2 != 0)){
                System.out.println("Size not Valid!");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Value is not valid-"+e.getMessage());
        }
    }
}
