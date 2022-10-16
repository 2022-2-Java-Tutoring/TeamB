import java.util.Scanner;

class Seat {
	private String seat[];
	
	public Seat() {
		seat = new String[10];
		for(int i=0;i<seat.length;i++) {
			seat[i] = "---";
		}
	}
	
	public void Show() {
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+ " ");
		}
		System.out.println();
	}
	
	public void Set(String name, int num) {
		seat[num-1] = name;
	}
	
	public boolean reSet(String name) {
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i] = "---";
				return true;
			}
		}
		return false;
	}
}

	


public class Prob12 {
	Scanner scanner = new Scanner(System.in);
	private Seat s[];
	private String seatGrade[] = {"S", "A", "B"};
	
	public Prob12() {
		s = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat();
		}
	}
	
	public void Reserve() {
		System.out.print("좌석: S(1), A(2), B(3) >>");
		int seatNum = scanner.nextInt();
		//선택한 좌석의 상태를 보여주는 메소드 호출 
		System.out.print(seatGrade[seatNum-1]+">>");
		s[seatNum-1].Show();
		
		System.out.print("이름>>");
		String name = scanner.next();
		System.out.print("번호>>");
		int num = scanner.nextInt();
		s[seatNum-1].Set(name,num);
	}
	
	public void View() {
		for(int i=0; i<s.length; i++ ) {
			System.out.print(seatGrade[i]+">>");
			s[i].Show();
		}
		System.out.println("조회를 완료했습니다");
	}
	
	public void Cancel() {
		System.out.print("좌석 S:1, A:2, B:3>>");
		int grade = scanner.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("이름>>");
		String name = scanner.next();
		
		boolean result = s[grade-1].reSet(name);
		if(result==true)
			System.out.println("취소를 완료하였습니다");
		else
			System.out.println("정보가 없습니다.");
	}
	public void run() {
		System.out.println("명품콘서트홀 예약 시스템입니다");
		while (true) {
			System.out.println("1.예약 2. 조회 3.취소 4.종료");
			int num=scanner.nextInt();
			switch(num) {
			case 1: 	
				Reserve();
				break;
			case 2:
				View();
				break;
			case 3:
				Cancel();
				break;
			case 4:
				return;
			}
		}
	}

	public static void main(String[] args) {
		Prob12 r = new Prob12();
		r.run();
	}
}
