package jv14_javacore_exercise;

public class bt03 {
	public static void main(String[] args) {
		System.out.print("Java version: ");
		System.out.println(System.getProperty("java.version"));
		System.out.print("Java runtime version: ");
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.print("Java home: ");
		System.out.println(System.getProperty("java.home"));
		System.out.print("Java vendor: ");
		System.out.println(System.getProperty("java.vendor"));
		System.out.print("Java vendor URL: ");
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.print("Java class path: ");
		System.out.println(System.getProperty("java.class.path"));
	}
}
