import java.util.Scanner;

interface Stack{
	int length();//현재 스택에 저장된 개수 리턴
	int capacity();//스택의 전체 저장 가능한 개수 리턴
	String pop();//스택의 top에 실수 저장
	boolean push(String val);//스택의 top에 저장된 실수 리턴
}

class StringStack implements Stack{
	private int size;
	private int index;
	private String[] stack;
	public StringStack(int size) {//생성자
		this.size=size;	
		this.index=-1;//스택에 저장된 것 없음
		stack=new String[size];//stack객체 생성
	}
	@Override
	public int length() {
		return index+1;
	}
	@Override
	public int capacity() {
		return stack.length;
	}
	@Override
	public String pop() {
		String popStr;
		if(index==-1)//스택에 저장 된 것이 없다면
			return null;
		popStr=stack[index];//아니라면, 스택을 popStr에 저장하고
		index--;//인덱스 번호 후위연산 실행
		return popStr;
	}
	@Override
	public boolean push(String val) {
		if(index+1<size) {//아직 꽉 안 찼다면
			index++;
			stack[index]=val;//입력받은 문자열 스택에 저장
			return true;
		}
		else {//꽉 찼다면
			return false;
		}
	}

//	private void stringInput() {//문자열 입력하는 메소드
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("총 스택 저장 공간의 크기 입력>> ");
//		int size=scanner.nextInt();
//		StringStack Stack=new StringStack(size);//size만큼 객체 생성
//		while(true) {
//				System.out.print("문자열 입력 >> ");
//				String val=scanner.next();
//				if(val.equals("그만"))
//					break;
//				if(!Stack.push(val))
//					System.out.println("스택이 꽉 차서 푸시 불가!");
//				}
//		System.out.print("스택에 저장된 모든 문자열 팝: ");
//		for(int i=0;i<Stack.capacity();i++) {
//			System.out.print(Stack.pop() +" ");
//		}
//		}
//	
////	public void popVal() {	
////		System.out.print("스택에 저장된 모든 문자열 팝: ");
////		for(int i=0;i<Stack.capacity();i++) {
////			System.out.print(Stack.pop() +" ");
////		}
////	}
//	public void run() {
//		stringInput();
//	}
}

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>> ");
		int size=scanner.nextInt();
		StringStack Stack=new StringStack(size);//size만큼 객체 생성
		while(true) {
				System.out.print("문자열 입력 >> ");
				String val=scanner.next();
				if(val.equals("그만"))
					break;
				if(!Stack.push(val))
					System.out.println("스택이 꽉 차서 푸시 불가!");
				}
		System.out.print("스택에 저장된 모든 문자열 팝: ");
		for(int i=0;i<Stack.capacity();i++) {
			System.out.print(Stack.pop() +" ");
		}
	}

}