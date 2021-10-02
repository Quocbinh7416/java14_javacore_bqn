package jv14_javacore_exercise;
import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {	
		
		System.out.println("Nhập số thứ nhất: ");
		Scanner input1 = new Scanner(System.in);
		int a = input1.nextInt();
		
		System.out.println("Nhập số thứ hai: ");
		Scanner input2 = new Scanner(System.in);
		int b = input2.nextInt();
		
		System.out.println("Nhập số thứ ba: ");
		Scanner input3 = new Scanner(System.in);
		int c = input3.nextInt();
		if (a < b && b < c) {
			System.out.println("Dãy số tăng dần");
		} else if (a > b && b > c) {
			System.out.println("Dãy số giảm dần");
		} else {System.out.println("Dãy chưa được sắp xếp");}
		
		
	}
}
