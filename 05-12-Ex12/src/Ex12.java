import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;}//링크 연결
	public Shape getNext() {return next;}
	public abstract void draw();//추상 메소드
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor{
	Scanner scanner=new Scanner(System.in);
	private Shape start;//시작노드
	private Shape last;//끝노드
	private int count=0;//총 노드 수
	public GraphicEditor() {//생성자
		start=null;
		last=null;

	}
	public void run() {

		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int num=scanner.nextInt();
			switch(num) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				num=scanner.nextInt();
				insert(num);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>>");
				num=scanner.nextInt();
				delete(num);
				break;
			case 3:
				printShape();
				break;
			case 4:
				System.out.print("beauty을 종료합니다.");
				return;
			}


	}


	}
	public void insert(int num) {//삽입
		Shape graphic;
		switch(num) {
		case 1:
			graphic=new Line();
			break;
		case 2:
			graphic=new Rect();
			break;
		case 3:
			graphic=new Circle();
			break;
		default:
			return;
		}
		if(start==null) {//첫 노드가 아무것도 가리키지 않으면
			start=graphic;
			last=graphic;//start와 last가 새로운 노드 가리킴
			count++;//객체 수 증가
		}
		else {
			last.setNext(graphic);//그렇지 않으면 last에 링크 연결하고
			last=graphic;//last는 새로운 노드 가리킴
			count++;//객체 수 증가
		}
	}
	public void delete(int num) {//삭제
		Shape current=start;//현재 노드
		Shape temp=start;
		int i;

		if(count<num) {//노드 수가 입력 값보다 적을 때
			System.out.println("삭제할 수 없습니다.");
			return;
		}
		if(num==1) {//첫번째 노드를 삭제
			if(start==last) {//노드가 한 개인 경우
				start=null;
				last=null;
				return;
			}
			else {//노드가 두 개 이상인 경우
				start=start.getNext();//시작노드의 다음노드를 저장
				return;
			}
		}
		for(i=1;i<num;i++) {
			temp=current;//현재 노드를 저장
			current=current.getNext();//다음 노드로 이동

		}
		if(i==num) {//끝 노드를 가리킬 때
			temp.setNext(current.getNext());
			last=temp;
		}
		else {
			temp.setNext(current.getNext());
		}

	}
	public void printShape() {
		Shape shape=start;
		while(shape!=null) {
			shape.draw();
			shape=shape.getNext();
		}
	}
}

public class Ex12 {

	public static void main(String[] args) {
		GraphicEditor editor=new GraphicEditor();
		editor.run();
	}

}