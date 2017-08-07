package lang;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR,1992 );
		cal2.set(Calendar.MONTH,12);//-1
		cal2.set(Calendar.DATE,10);
		//한번에 세팅 가능
		//cal2.set(1992,12,10);
		
		cal2.add(Calendar.DATE, 100);
		printDate(cal2);
		
		cal2.add(Calendar.DATE, 1000);
		printDate(cal2);
		
		cal2.add(Calendar.DATE, 10000);
		printDate(cal2);
	}
	public static void printDate(Calendar cal) {
		String[] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int year = cal.get(Calendar.YEAR);
		//(0~11)
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		//1(일) ~ 7(토) 
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		int am = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		System.out.println(year+"년"+(month +1)+"월"+date+"일"+"("+days[day-1]+")"+hour+":"+minute + ":"+ seconds);
	}

}
