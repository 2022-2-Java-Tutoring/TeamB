import java.util.Scanner;

public class Num11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		String s= scanner.nextLine();
		StringBuffer st = new StringBuffer(s);
		while(true) {
			System.out.print("명령: ");
			String s1= scanner.nextLine();
			if(s1.equals("그만")) {
				System.out.print("종료랍니다.");
				break;
				}
			String [] finda= s1.split("!");
			if(finda.length!=2) {
				System.out.print("잘못된 명령입니다!");
				
			}
			else {
				if(finda[0].length()==0 || finda[1].length()==0) {
					System.out.print("잘못된 명령입니다");
					continue;
				}
				if(st.indexOf(finda[0])==-1) {
					System.out.println("찾을 수 없습니다");
					continue;
				}
				st.replace(st.indexOf(finda[0]), st.indexOf(finda[0])+finda[0].length(), finda[1]);
				System.out.print(st);
				
				
			}
			
		}

		
		

	}

}
