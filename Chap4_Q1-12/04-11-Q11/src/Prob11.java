import java.util.Scanner;

class Add {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a+b;
	}
}

class Sub {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a-b;
	}
}

class Mul {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
}
	public int calculate() {
		return a*b;
	}
}

class Div {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
}
	public int calculate() {
		return a/b;
	}
}

public class Prob11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String cal;
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		a = sc.nextInt();
		b = sc.nextInt();
		cal = sc.next();
		
		switch(cal) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		default:
			System.out.println("error");
		}
	}
}