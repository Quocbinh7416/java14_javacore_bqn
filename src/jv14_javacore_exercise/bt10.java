package jv14_javacore_exercise;

import java.util.Scanner;

public class bt10 {
	public static boolean isPrimeNumber(int n) {
		if (n<2) {
			return false;
		}
		
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i ++) {
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void timTongSoNguyenTo(int n) {
		int sum = 0 ;
		System.out.println("Các số nguyên tố là ");
		
		for (int i = 0 ; i < n; i ++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+", ");
				sum += i;
			}
		}
		System.out.println("");
		System.out.println("Tổng các số nguyên tố là "+sum);
	}
		
	
	public static void main(String[] args) {
		System.out.println("Nhap so n bat ki");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		timTongSoNguyenTo(n);
	}
}
