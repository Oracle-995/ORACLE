package ch15retire;

import java.util.HashSet;
import java.util.Set;

public class Order {
	//所有订单 定义为一个集合 
	Set<OrderDetail> OrderDetails =new HashSet<OrderDetail>();
	private double sumprice;
	
	// 订单详细
	
	public void showInfo() {
		System.out.println("-----订单详细------");
		// 遍历OrderDetails
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
