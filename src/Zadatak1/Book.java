package Zadatak1;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	Book() {

	}

	Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	// geteri
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	// seteri
	public void setPrice(double price) {
		this.price = price;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return "\nBook name: " + getName() + "\nAuthor\n: name: " + author.getName() + " email: " + author.getEmail()
				+ " gender: " + author.getEmail() + "\nPrice: " + getPrice();
	}

}
