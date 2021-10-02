package jv14_javacore_exercise;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class exTinhTienKaraoke {
	static int tinhTongTien(long diffMin, boolean onSale) {
		int tongTien = 0;
		if (diffMin <= 180) {
			tongTien = (int) (diffMin / 60 * 30000);
		} else {
			tongTien = (int) (3*30000+ (diffMin - 180)/60*30000*0.7);
		}
		if (onSale) {
			tongTien = (int) (tongTien * 0.8);
		}
		return tongTien;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalTime startTime = LocalTime.of(9, 0);
		LocalTime endTime = LocalTime.of(0, 0);
		LocalTime saleTime = LocalTime.of(17, 0);
		
		System.out.println("Nhập giờ bắt đầu: (hh:mm) - từ 09:00 trở đi");
		String time1 = scanner.nextLine();
		LocalTime lt1 = LocalTime.parse(time1);
		System.out.println("Nhập giờ kết thúc: (hh:mm) - trước 24:00");
		String time2 = scanner.nextLine();
		LocalTime lt2 = LocalTime.parse(time2);
		
		boolean onSale = false;
		if (lt1.getHour() <=17) {
			onSale = true;
		}
		
		long diffMin = Duration.between(lt1,lt2).toMinutes();
		
		int tongTien = tinhTongTien(diffMin,onSale);
		
		
		System.out.println("Tổng chi phí phải trả là: " + tongTien+" VND");
	}
}
