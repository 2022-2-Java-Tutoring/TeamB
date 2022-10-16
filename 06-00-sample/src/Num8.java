import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("문자열을 입력하세요 . 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String s=scanner.nextLine();
		for(int i=0;i<s.length();i++) {
			int start=0 ;
			int end = 1;
			String a= s.substring(start, end);
			String b= s.substring(1);
			
			s= b+a;
			System.out.println(s);
			
			
		}

	}

}
