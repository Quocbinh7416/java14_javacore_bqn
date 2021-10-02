package jv14_javacore_exercise;

import java.util.Scanner;

public class bt08 {
	public static void main(String[] args) {
		System.out.println("Nhap chuoi bat ki");
		Scanner sc = new Scanner(System.in);
		String s1 = (String) sc.next();
		String s2 =s1.toUpperCase();
		char first = s2.charAt(0);
		System.out.print(first);
		for (int i = 1 ; i < s1.length();i++) {
			char character = s1.charAt(i);
			System.out.print(character);
		}
	}
}
