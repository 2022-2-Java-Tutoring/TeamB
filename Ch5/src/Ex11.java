import java.util.Scanner;

abstract class Calc{
	protected int a,b;
	public void setValue(int a,int b){//피연산자 값을 객체 내에 저장한다.
		this.a=a;
		this.b=b;
	}
	abstract int calculate();//클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
}

class Add extends Calc{
	@Override
	public int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	@Override
	public int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	@Override
	public int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	@Override
	public int calculate() {
		return a/b;
	}
}
public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		String op=scanner.next();
		
		switch(op) {
		case "+":
			Add add=new Add();//Add객체 생성
			add.setValue(a,b);
			System.out.print(add.calculate());
			break;
			
		case "-":
			Sub sub=new Sub();//Sub객체 생성
			sub.setValue(a,b);
			System.out.print(sub.calculate());
			break;
			
		case "*":
			Mul mul=new Mul();//Mul객체 생성
			mul.setValue(a,b);
			System.out.print(mul.calculate());
			break;
			
		case "/":
			Div div=new Div();//Div객체 생성
			div.setValue(a,b);
			System.out.print(div.calculate());
			break;
			
		}
		
	}

}
