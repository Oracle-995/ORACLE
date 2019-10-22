package ch15retire;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookStore {
	// 定义书店集合 存储书的信息  
	Map <String,Book> books=new TreeMap<String,Book>();

	public void init() {
		Scanner scan =new Scanner(System.in);
		String bname;
		double price;
		String author;
		String flag="y";
		do {
			System.out.println("书名：");
			bname=scan.next();
			System.out.println("价格：");
			price=scan.nextDouble();
			System.out.println("作者：");
			author=scan.next();
			// 添加图书
			books.put(bname, new Book(bname,price,author));

			System.out.println("是否继续输入？y/n");
			 flag =scan.next();
		}while("y".equals(flag));
	}
	
	public void list() {
		for(String bname:books.keySet()) {
			Book sbook =books.get(bname);
			System.out.println(sbook);
		}
	}
	
	//根据书名查找书
	public Book findByBname(String name) {
		// key : bname values :书对象
		for(String str:books.keySet()) {
			if(name.equals(str)) {
				return books.get(name);
			}
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
