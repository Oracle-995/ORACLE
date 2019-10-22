package ch15retire;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookStore {
	// ������꼯�� �洢�����Ϣ  
	Map <String,Book> books=new TreeMap<String,Book>();

	public void init() {
		Scanner scan =new Scanner(System.in);
		String bname;
		double price;
		String author;
		String flag="y";
		do {
			System.out.println("������");
			bname=scan.next();
			System.out.println("�۸�");
			price=scan.nextDouble();
			System.out.println("���ߣ�");
			author=scan.next();
			// ���ͼ��
			books.put(bname, new Book(bname,price,author));

			System.out.println("�Ƿ�������룿y/n");
			 flag =scan.next();
		}while("y".equals(flag));
	}
	
	public void list() {
		for(String bname:books.keySet()) {
			Book sbook =books.get(bname);
			System.out.println(sbook);
		}
	}
	
	//��������������
	public Book findByBname(String name) {
		// key : bname values :�����
		for(String str:books.keySet()) {
			if(name.equals(str)) {
				return books.get(name);
			}
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
