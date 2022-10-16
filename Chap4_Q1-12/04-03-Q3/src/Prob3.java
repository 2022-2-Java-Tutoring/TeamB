
class Song {
	private String title;
	private String singer;
	private int year;
	private String country;
	
	public Song() {
	}
	
	public Song(String title, String singer, int year, String country) {
		this.title = title;
		this.singer = singer;
		this.year=year;
		this.country=country;
	}
	public void show() {
		System.out.println(year +"년 " + country + "국적의 " + singer + "가 부른 " + title);
	}
}
public class Prob3 {
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		
		song.show();
	}
}
