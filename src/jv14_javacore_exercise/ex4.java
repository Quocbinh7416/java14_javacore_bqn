package jv14_javacore_exercise;
import java.util.Scanner;
import java.lang.Math;

public class ex4 {
	public static void main(String[] args) {
		System.out.println("Nhập vào một số tự nhiên");
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		if (num <=0) {
			System.out.println("Vui lòng nhập số tự nhiên");
		} else {
			int dem =  (int) Math.ceil(Math.log10(num));
			
			System.out.println(dem);
		}
		
	}
}
