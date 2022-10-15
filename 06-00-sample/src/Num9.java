import java.util.Scanner;

class Playerss{
	Scanner scanner = new Scanner(System.in);
	private String name;
	Playerss(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int findNum() {
		System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		int num[] = new int[4];
		int number= scanner.nextInt();
		return number;

	}
}
class Computer extends Playerss{
	public Computer(String name) {
		super(name);
	}
	public int findNum() {
		return (int)(Math.random()*3+1);
	}
}
class Game{
	private Playerss players [] = new Playerss[2];
	private String [] rcp = {"가위" ,"바위","보"};
	
	
	public Game() {
		players[0]= new Playerss("철수");
		players[1]= new Playerss("컴퓨터");
	}
	public void runGame() {
		int person, computer;
		while(true) {
			person = players[0].findNum();
			if(person < 1 || person > 4)
				System.out.println("잘못 입력했습니다.");
			else if(person == 4)
				break;
			
			computer = players[1].findNum();
			
			System.out.print(players[0].getName() + "(" + rcp[person - 1] + ")  :  ");
			System.out.println(players[1].getName() + "(" + rcp[computer - 1] + ")");
			
			if(person == computer)
				System.out.println("비겼습니다.");
			else if((person == 1 && computer == 2) || (person == 2 && computer == 3) || 
					(person == 3 && computer == 1))
				System.out.println(players[1].getName() + "가 이겼습니다.");
			else if((person == 1 && computer == 3) || (person == 2 && computer == 1) || 
					(person == 3 && computer == 2))
				System.out.println(players[0].getName() + "가 이겼습니다.");
		}



	}
}
public class Num9 {

	public static void main(String[] args) {
		Game game = new Game();
		game.runGame();

	}

}
