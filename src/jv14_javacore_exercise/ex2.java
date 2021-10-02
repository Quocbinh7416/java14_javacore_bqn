package jv14_javacore_exercise;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;



public class ex2 {
	
	
	public static void main(String[] args) {
		System.out.println("Nhập vào múi giờ: ");
		
		Scanner muiGio = new Scanner(System.in);
		int input_muiGio = muiGio.nextInt();
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));	
		int Hour = cal.get(Calendar.HOUR_OF_DAY)+input_muiGio;
		
		
		if(input_muiGio>12 || input_muiGio<-12) {
			System.out.println("Nhập sai múi giờ");
		} else if(input_muiGio <0 ) {
			input_muiGio = 12 -input_muiGio;
			if (Hour >= 12) {Hour = Hour - 12;}
			System.out.println("Thời gian hiện tại là " + Hour +":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		} 	else  {
			if (Hour >= 12) {Hour = Hour - 12;}
			System.out.println("Thời gian hiện tại là " + Hour +":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		} 		
		
	}
}
