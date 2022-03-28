package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cashier <T extends ClothingItem> {
  Map<T,Integer> cart;
    LocalDateTime localDateTime;
//  Calendar calendar=Calendar.getInstance();
//  Date date=;
//  SimpleDateFormat simpleDateFormat=date.

    public Cashier() {
        this.cart =new LinkedHashMap<>();
    }

    void addItemToCart(T item,int amount){
     this.cart.put(item,amount);
    }

    double itemPrice(T item,int amount){
        double discountPrice=0;

         return discountPrice;
    }

    int discountPrice(T item){
        String day=localDateTime.getDayOfWeek().toString();

        if(cart.size()>2 && (!day.equalsIgnoreCase("TUSDAY"))){
            return 20;
        }else if (cart.size()<3 && (day.equalsIgnoreCase("TUSDAY"))){
            if (item.getType().equalsIgnoreCase("Shirt")){
                return 10;
            }else  if (item.getType().equalsIgnoreCase("Shoes")){
                return 25;
            }
        }else  if (cart.size()>2 && day.equalsIgnoreCase("Tusday")){
            if (item.getType().equalsIgnoreCase("Shirt")){
                return 25;
            }else {
                return 20;
            }
        }
        return 0;

    }

    void clearCart(){
        double sum=0;

        localDateTime=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E, MMM dd yyyy, HH:mm ");
        System.out.println("Date: "+localDateTime.format(dtf)+"h");
        System.out.println("--Products--");

        String dayOf=localDateTime.getDayOfWeek().toString();

      for(Map.Entry<T,Integer> i:cart.entrySet()){

          System.out.println(i.getKey().getName()+"-"+i.getKey().getBrand());
          System.out.println("Price $"+i.getKey().getPrice()+"\n Discount that will apply: "+discountPrice(i.getKey())+"%");

          sum=sum+(i.getKey().getPrice()-((i.getKey().getPrice()*discountPrice(i.getKey()))/100))*i.getValue();
      }
        System.out.println("Total price: "+sum);
      this.cart.clear();
    }
}
