package jv14_javacore_exercise;

import java.util.Scanner;

public class bt12 {
	public static void main(String[] args) {
		System.out.println("Nhap so n tu 1 - 9");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <1 || n >9) {
			System.out.println("vui long nhap lai so n tu 0 - 9");
		} else {
			for (int i = 1 ; i <=n; i++) {
				for (int j = 1; j <=i; j++) {
					System.out.print(j+ " ");
				}
				System.out.println("");
			}
		}
	
	}
}
