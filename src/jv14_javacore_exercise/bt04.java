package jv14_javacore_exercise;

import java.util.Scanner;

public class bt04 {
	public static void main(String[] args) {
		System.out.println("Nhap so tu nhien");
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		int length = (int) Math.log10(num) + 1;
		int sum = 0;
		for (int i = 0; i<=length; i ++ ) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("Tong cac chu so "+sum);
	}
}

