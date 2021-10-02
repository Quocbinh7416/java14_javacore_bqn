package jv14_javacore_exercise;

public class bt06 {
	public static void main(String[] args) {
		String s1 = "Cybersoft";
		for (int i=s1.length()-1; i >=0;i--) {
			char charIndex = s1.charAt(i);
			System.out.print(charIndex);
		}
	}
}
