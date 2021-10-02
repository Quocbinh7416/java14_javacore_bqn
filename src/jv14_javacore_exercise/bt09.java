package jv14_javacore_exercise;

import java.util.Scanner;

public class bt09 {
	public static void main(String[] args) {
		System.out.println("Nhap 2 so tu nhien bat ki tu 10 - 99");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		
		if (num1 <10 || num1 >99 || num2<10 || num2>99) {
			System.out.println("Nhap so tu 10 - 99");
		} else {
			String s1 = Integer.toString(num1);
			String s2 = Integer.toString(num2);
			
			char char1 = s1.charAt(0);
			char char2 = s1.charAt(1);
			char char3 = s2.charAt(0);
			char char4 = s2.charAt(1);
			
			if (char1 == char3 || char1 == char4 || char2 == char3 || char2 == char4) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
		}
	}
}
