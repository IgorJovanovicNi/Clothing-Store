package com.company;

public class Main {

    public static void main(String[] args) {
	Shirts s1=new Shirts("Siva Kosulja","Guci","XL","Blue");
	Shoes e1=new Shoes("Siva Cipele","Gi","61","Blue");
	Trousers t1=new Trousers("Siva Kosulja","Cci","54","Blue");
	SuitJacket r1=new SuitJacket("Siva Kosulja","Cuci","23","Blue");

	Cashier ccc=new Cashier();
	ccc.addItemToCart(s1,1);
	ccc.addItemToCart(e1,4);
	ccc.addItemToCart(r1,2);
	ccc.addItemToCart(t1,3);

	ccc.clearCart();






    }
}
