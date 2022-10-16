import java.util.Scanner;

class Players{
	private String name;
	private Scanner scanner=new Scanner(System.in);
	public Players(String name) {
		this.name=name;
	}
	public String getName() {return name;}
	
	public boolean turn() {
		System.out.print("[" + name + "]:<Enter>");
		scanner.nextLine();
		int n[] =new int [3];
		for(int i=0;i<n.length;i++) {
			n[i] = (int)(Math.random()*3+1);//1~3
		}
		
		for(int i=0;i<n.length;i++) {
			System.out.print("\t" + n[i]);
		}
		boolean flag= true; //누가 먼저 시작할건지.
		
		for(int i=0;i<n.length;i++) {
			if(n[0] != n[i]) {
				flag=false;
			}
		}
		if(flag==true) {
			return true;
			
		}
		else {
			System.out.print(" 아쉽군요!\n");
			return false;
		}
	}
}


public class Num10 {

	private Players[] players=null;
	private Scanner scanner=new Scanner(System.in);
	public Num10() {
		players =new Players[2];
	}
	
	private void makePlayers() {
		for(int i=0;i<players.length;i++) {
			System.out.print("선수이름>>");
			String name=scanner.nextLine();
			players[i] =new Players(name);
		}
	}
	private void startGame() {
		int index=0;
		while(true) {
			if(players[index].turn()) {
				System.out.println(players[index].getName()+" 승리");
				break;
			}
			else {
				index++;
				index %=2;
			}
		}
	}
	public void run() {
		 makePlayers();
		 startGame();

	}
	
	
	public static void main(String[] args) {
		Num10 game=new Num10();
		game.run();

	}

}
