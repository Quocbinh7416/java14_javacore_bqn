package jv14_javacore_exercise;

import java.util.Scanner;

public class bt07 {
	public static void main(String[] args) {
		System.out.println("Nhap so tu nhien bat ki");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2 == 0) {
			System.out.println("Các ước là " + num);
		} else {
			System.out.println("Các ước là ");
			for (int i = 3 ; i< num; i +=2) {
				if (num%i ==0) {
					System.out.print(i + ", ");
					num = num / i;
				}
			}
		}
	}
}
