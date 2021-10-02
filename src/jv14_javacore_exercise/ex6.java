package jv14_javacore_exercise;
import java.util.Scanner;
import java.util.Arrays;

public class ex6 {
	public static void main(String[] args) {
		int[] arrayA = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hãy nhập dãy bất kì ");
		for (int i = 0; i<10;i++) {
			System.out.println("Nhập giá trị thứ " + i);
			arrayA[i] = scanner.nextInt();			
		}
		System.out.println("Dãy vừa nhập là");
		System.out.println(Arrays.toString(arrayA));
		
		boolean check = false;
		for (int i = 0; i<10;i++) {
			if (arrayA[i]==arrayA[9-i]) {
				System.out.println("Có phần tử thứ " + i + " trùng với phần tử thứ " + (9-i));
				check = true;
			}
		}
		if (check == false) {System.out.println("Không thoả yêu cầu đề ra");}
	}
}
