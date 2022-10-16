import java.util.Scanner;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void turn() {
		System.out.print("[" + name + "]:<Enter>");
	}
	
	public boolean randomNum() {
		int num[] = new int[3];
		boolean win = true;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 3 + 1);
			System.out.print(num[i] + "\t");
		}
		
		for(int i = 0; i < num.length; i++) {
			if(!(num[0] == num[i])) {
				win = false;
				break;
			}
		}
		return win;
	}
}

class Games {
	Scanner sc = new Scanner(System.in);
	Person[] person;
	
	public Games() {
		System.out.print("갬블링 게임에 참여할 선수 숫자>>");
		int n = sc.nextInt();
		person = new Person[n];
		for(int i = 0; i < person.length; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			person[i] = new Person(sc.next());
		}
	}
	
	public void run() {
		while(true) {
			for(int i = 0; i < person.length; i++) {
				sc.nextLine();
				person[i].turn();
				sc.nextLine();
				
				if(person[i].randomNum()) {
					System.out.print(person[i].getName() + "님이 이겼습니다!");
					return;
				}
				else System.out.print("아쉽군요!");
			}
		}
	}
	
}

public class Num12 {
	public static void main(String[] args) {
		Games game = new Games();
		game.run();
	}
}
