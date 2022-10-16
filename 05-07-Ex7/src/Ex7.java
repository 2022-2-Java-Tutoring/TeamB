class Point{
	private int x,y;
	public Point(int x,int y) {this.x=x;this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}

}
class Point3D extends Point{
	private int z;//z축 값
	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	public void moveUp() {
		this.z+=1;

	}
	public void moveDown() {
		this.z-=1;
	}
	public void move(int x,int y,int z) {
		move(x,y);
		this.z=z;
	}
	public String toString() {
		return "(" + getX()+ "," + getY() + "," + this.z  + ")";
	}

}
public class Ex7 {

	public static void main(String[] args) {
		Point3D p=new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");

		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");

		p.move(100,200,300);
		System.out.println(p.toString()+"입니다.");

	}

}