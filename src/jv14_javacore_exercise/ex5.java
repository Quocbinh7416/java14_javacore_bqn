package jv14_javacore_exercise;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		System.out.println("Nhập vào một số tự nhiên");
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		float sum = 1f/6;
		for (int i = 2 ; i <= num; i ++) {
			sum = sum + 1f/(i*(i+1)*(i+2));
		}
		System.out.printf("Giá trị của tổng là : %f",sum);
	}
}
