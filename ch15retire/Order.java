package ch15retire;

import java.util.HashSet;
import java.util.Set;

public class Order {
	//���ж��� ����Ϊһ������ 
	Set<OrderDetail> OrderDetails =new HashSet<OrderDetail>();
	private double sumprice;
	
	// ������ϸ
	
	public void showInfo() {
		System.out.println("-----������ϸ------");
		// ����OrderDetails
		double sumprice=0;
		for(OrderDetail od :OrderDetails) {
			
			Book book =od.getBook();
			System.out.println(book.getBname()+"  "+book.getPrice()+"  "+od.getNum());
			sumprice += od.getNum();
		}
		System.out.println(sumprice);
	}
	
	public void add(Book book,int num) {
		OrderDetail od =new OrderDetail(book,num);
		OrderDetails.add(od);
	}
	
}
