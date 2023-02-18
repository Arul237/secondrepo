package com.onesoft.fifteen.stream;

public class Boks {

private int id;
private String name;
private String author;
private int price;
private int edition;
public Boks(int id, String name, String author, int price, int edition) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
	this.edition = edition;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPages(int price) {
	this.price = price;
}
public int getEdition() {
	return edition;
}
public void setEdition(int edition) {
	this.edition = edition;
}
@Override
public String toString() {
	return  id + ", name=" + name + ", author=" + author + ", pages=" + price + ", edition=" + edition
			;
}
}
