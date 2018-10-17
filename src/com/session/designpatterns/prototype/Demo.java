package com.session.designpatterns.prototype;

public class Demo {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop shop1 = new BookShop();
	shop1.setShopName("First Shop Name");
	shop1.loadData();
	
	BookShop shop2 = shop1.clone();
	shop2.setShopName("Second Shop Name");
	
	//Adding and removing some books from shop1
	shop2.getBooks().remove(1);
	
	Book newBook = new Book();
	newBook.setId(15);
	newBook.setName("Book 15");
	
	shop2.getBooks().add(newBook);
	
	System.out.println(shop1);
	System.out.println("------------");
	System.out.println(shop2);
	
}
}
