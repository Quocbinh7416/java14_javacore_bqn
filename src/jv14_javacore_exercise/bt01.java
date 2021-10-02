package jv14_javacore_exercise;

public class bt01 {
	static void printLine1() {
		for (int i = 0; i < 7; i++) {
			System.out.print("* ");
		}
		for (int i = 0; i < 40; i++) {
			System.out.print("=");
		} 
		System.out.println("");
	}
	static void printLine2() {
		for (int i = 0; i < 6; i++) {
			System.out.print(" *");
		}
		System.out.print("  ");
		for (int i = 0; i < 40; i++) {
			System.out.print("=");
		} 
		System.out.println("");
	}
	static void printLine3() {
		for (int i = 0; i < 54; i++) {
			System.out.print("=");
		} 
		System.out.println("");
	}
	public static void main(String[] args) {
		
		for (int i =0; i< 5; i ++) {
			printLine1();
			printLine2();
		}
		
		printLine1();
		
		for (int i =0; i< 7; i ++) {
			printLine3();
		}
}
}
