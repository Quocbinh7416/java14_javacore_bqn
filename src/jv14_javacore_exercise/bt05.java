package jv14_javacore_exercise;

import java.util.Scanner;

public class bt05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do x cua A");
		float x1 = sc.nextFloat();
		System.out.println("Nhap toa do y cua A");
		float y1 = sc.nextFloat();
		System.out.println("Nhap toa do x cua B");
		float x2 = sc.nextFloat();
		System.out.println("Nhap toa do y cua B");
		float y2 = sc.nextFloat();
		
		float xab = x2 -x1;
		float yab = y2 - y1;
		float AB = (float) Math.sqrt(xab*xab+yab*yab);
		
		System.out.println("Do dai doan AB la "+ AB);
	}
}
