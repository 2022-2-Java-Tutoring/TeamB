import java.util.Calendar;
public class Num5 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		int hours= date.get(Calendar.HOUR_OF_DAY);
		int minute= date.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+ hours + "시 "+ minute + "분입니다.");
		
		if(hours>=4 && hours<=12)
			System.out.print("good morning");
		else if( hours>=12 && hours<=18)
			System.out.print("good afternoon");
		else if(hours>=18 && hours<= 22)
			System.out.print("good evening");
		else System.out.print("good night");

	}

}
