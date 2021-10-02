package jv14_javacore_exercise;
import java.util.Scanner;

public class bt02 {
	static void DecimalToBinary(int num){
		int array[] = new int[40];
		int index = 0;
		while (num>0) {
			array[index++]= num%2;
			num = num/2;
		}
		for (int i = index-1; i >=0;  i-- ) {
			System.out.print(array[i]);
		}
	}
	
	static void BinaryToDecimal(long num) {
		int decimal = 0;
		int length = (int) Math.log10(num)+1;
		for (int i = 0 ; i <= length; i ++) {
			int a = (int) (num%10);
			if (a == 1) {
				decimal += Math.pow(2, i);
			}
			num /=10;
		}
		
		System.out.print(decimal);
	}
	public static void main(String[] args) {
		
		System.out.println("Chuyển hệ : true (từ 10 sang 2) false (từ 2 sang 10)");
		Scanner scanner = new Scanner(System.in);
		
		Boolean boo1 = scanner.nextBoolean();
		
		if (boo1) {
			System.out.println("Nhập số thập phân: ");
			int num = scanner.nextInt();
			System.out.print("Kết quả là ");
			DecimalToBinary(num);
		} else {	
			System.out.println("Nhập số nhị phân: ");
			long num = scanner.nextLong();
			System.out.print("Kết quả là ");
			BinaryToDecimal(num);
		}
	}
}
