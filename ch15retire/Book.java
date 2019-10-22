package ch15retire;

public class Book {
	
	
	//定义图书属性
	private String bname;
	private String author;
	private double price;
	public Book(String bname, double price, String author) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bname+"\t"+price+"\t"+author;
	}
	
}
