package ch15retire;

import java.util.Scanner;

public class BookDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("--------��꿪ҵ,���ͼ��---------------");
		BookStore bookstore =new BookStore();
		Order order =new Order();
		bookstore.init();
		System.out.println("--------xxxxͼ�鹺���̳�----------------");
		String flag="y";
		bookstore.list();
		do {
			System.out.println("��������Ҫ�����������");
			String bname = scan.next();
			Book book=bookstore.findByBname(bname);
			if(book!=null) {
				System.out.println("��������Ҫ���������");
				int num= scan.nextInt();
				order.add(book, num);

			}
			else {
				System.out.println("�Ҳ�������Ϣ");
			}
			
			System.out.println("�Ƿ�������� y/n");
			flag=scan.next();
		}while("y".equals(flag));
		order.showInfo();
		
		
		
		

		
	
	}
}
