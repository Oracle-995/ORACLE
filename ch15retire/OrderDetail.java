package ch15retire;

public class OrderDetail {
  private Book book;
  private int num;
public OrderDetail() {
	super();
}
public OrderDetail(Book book, int num) {
	super();
	this.book = book;
	this.num = num;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
  
}
