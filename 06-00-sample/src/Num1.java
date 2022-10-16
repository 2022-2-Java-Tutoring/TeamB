class MyPoint{
	private int x,y;
	MyPoint(int x, int y){
		this.x= x;
		this.y =y;
		
	}
	public String toString() {
		return "Point(" + x + ", " + y +")";
	}
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint)obj;
		if(x==p.x && y==p.y)
			return true;
		else 
			return false;
	}
}
public class Num1 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");

	}

}
