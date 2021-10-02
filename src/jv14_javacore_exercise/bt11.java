package jv14_javacore_exercise;

import java.util.Scanner;

public class bt11 {
	public static void main(String[] args) {
		System.out.println("Nhap so n bat ki");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a = Math.log10(n);
		double b = Math.log10(2);
		int c = (int) Math.floor(a/b);
		System.out.println("So tu nhien lon nhat nho hon log2(n) la "+c);
	}
}
