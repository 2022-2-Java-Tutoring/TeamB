import java.util.Scanner;

class Grade {
	int average=0;
	int math, science, english = 0;
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english =english;
	}
	
	public int average() {
		return ((math + science + english)/3);
	}
}

public class Prob2 {

	
	public static void main(String[] args) {
			
	Scanner scanner = new Scanner(System.in);
			
	System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
	int math=scanner.nextInt();
	int science=scanner.nextInt();
	int english=scanner.nextInt();


	Grade me = new Grade(math, science, english);
	System.out.println("평균은 " + me.average());
			
	scanner.close();
			
	}
}

// 수학, 과학, 영어 순으로 3개의 점수 입력 >> 90 88 96 
// 평균은 91 