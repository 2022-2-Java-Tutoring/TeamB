import java.util.Scanner;
import java.util.StringTokenizer;

public class Num7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s= scanner.nextLine();
			//split를 이용해서 분리하기
			String sm[] = s.split(" ");
			System.out.println("어절 개수는 "+sm.length);
			//StringTokenizer 이용하기
			StringTokenizer st = new StringTokenizer(s," ");
			int n= st.countTokens();
			System.out.println("어절 개수는 "+ n);
			if(s=="그만")
				break;
		}
		
			

	}

}
