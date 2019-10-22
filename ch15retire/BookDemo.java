package ch15retire;

import java.util.Scanner;

public class BookDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("--------书店开业,添加图书---------------");
		BookStore bookstore =new BookStore();
		Order order =new Order();
		bookstore.init();
		System.out.println("--------xxxx图书购买商城----------------");
		String flag="y";
		bookstore.list();
		do {
			System.out.println("请输入你要购买的书名：");
			String bname = scan.next();
			Book book=bookstore.findByBname(bname);
			if(book!=null) {
				System.out.println("请输入你要购买的数量");
				int num= scan.nextInt();
				order.add(book, num);

			}
			else {
				System.out.println("找不到该信息");
			}
			
			System.out.println("是否继续购买？ y/n");
			flag=scan.next();
		}while("y".equals(flag));
		order.showInfo();
		
		
		
		

		
	
	}
}
