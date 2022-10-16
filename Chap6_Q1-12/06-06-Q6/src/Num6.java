import java.util.Calendar;
import java.util.Scanner;

class Player{
	private String name;
	private int time;
	Player(String name){
		this.name=name;

	}
	public void getTime(int time){
		this.time= time;
	}
	public String getString() {return name;}
	public int getSecond() { return time;}

	
}
class TimeGame{
	Scanner scanner = new Scanner(System.in);
	Player players[] = new Player[2];
	public void setPlayer() {
		players[1]= new Player("황기태");
		players[2]= new Player("이재문");
	}
	public void runGame() {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		for(int i=0;i<players.length;i++) {
			System.out.println( players[i].getString()+ " 시작 Enter키>>");
			String key= scanner.nextLine();
			int endsecond= Calendar.getInstance().get(Calendar.SECOND);
			System.out.println("10초 예상 후 <Enter> 키>>");
			int startsecond= Calendar.getInstance().get(Calendar.SECOND);
			
			if(endsecond < startsecond)
				players[i].getTime(endsecond-startsecond+60);
			else
				players[i].getTime(endsecond-startsecond);
		}

		
	}
	public void resultGame() {
		for(int i=0;i<players.length;i++) {
			System.out.print(players[i].getString()+ "의 결과 "+ players[i].getSecond());
			
		}
		if(Math.abs(players[0].getSecond())<Math.abs(players[1].getSecond()))
			System.out.println("승자는 "+ players[0].getString());
		else
			System.out.println("승자는 "+ players[1].getString());
	}
	
}
public class Num6 {

	public static void main(String[] args) {
		

	}

}
