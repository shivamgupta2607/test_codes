package com.session.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {

	private String shopName;
	private List<Book> books = new ArrayList<>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}

	// imitating database call
	public void loadData() {
		for (int i = 1; i < 10; i++) {
			Book b = new Book();
			b.setId(i);
			b.setName("Book " + i);
			getBooks().add(b);
		}

	}

	// Doing Deep Copy
	@Override
	protected BookShop clone() throws CloneNotSupportedException {

		BookShop bookShop = new BookShop();
		for (Book b : this.getBooks()) {
			bookShop.getBooks().add(b);
		}
		return bookShop;
		
	}
}
