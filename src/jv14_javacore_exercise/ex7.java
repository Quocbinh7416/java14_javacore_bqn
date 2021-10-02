package jv14_javacore_exercise;
import java.util.*;

public class ex7 {
	public static void main(String[] args) {
		System.out.println("Nhập vào 2 chuổi");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi thứ nhất");
		String s1 = scanner.next(); 
		System.out.println("Nhập chuỗi thứ hai");
		String s2 = scanner.next();
		
		System.out.println("Có phân biệt chữ hoa không?");
		Boolean boo1 = scanner.nextBoolean();
		
		if (boo1) {
			System.out.println("Có phân biệt");
			if (s1.equals(s2)) {
				System.out.println("2 chuỗi giống nhau");
			} else {
				System.out.println("2 chuỗi khác nhau");
			}
			
		} else {
			System.out.println("Không phân biệt");
			if (s1.toLowerCase().equals(s2.toLowerCase())) {
				System.out.println("2 chuỗi giống nhau");
			} else {
				System.out.println("2 chuỗi khác nhau");
			}
		}
	}
}
