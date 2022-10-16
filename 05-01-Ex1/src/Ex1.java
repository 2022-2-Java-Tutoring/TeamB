class TV{
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() {return size;}
	}

class ColorTV extends TV{
	private int color;//TV의 컬러

	public ColorTV(int size,int color) {
		super(size);//수퍼클래스의 생성자 선택
		this.color=color;
	}
	public void printProperty() {
		System.out.print(getSize()+"인치 "+ this.color+"컬러");
	}
}
public class Ex1 {
	public static void main(String[] args) {
		ColorTV myTV=new ColorTV(32,1024);//ColorTV의 객체 myTV생성
		myTV.printProperty();

	}
}