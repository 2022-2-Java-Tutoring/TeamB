class PositivePoint extends Point{
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x,int y) {
		super(x,y);
		if(x<0||y<0) {//x나y가 음수이면
			super.move(0, 0);//객체는 이동하지 않음
		}
	}
	protected void move(int x,int y) {//오버라이딩
		if(x>0&&y>0) {//x와 y모두 양수이면
			super.move(x,y);//이동
		}		
	}
	public String toString() {
		return "("+getX()+","+getY()+") 의 점";
	}
}
public class Ex8 {

	public static void main(String[] args) {
		PositivePoint p=new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5,5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2=new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다.");

	}

}
