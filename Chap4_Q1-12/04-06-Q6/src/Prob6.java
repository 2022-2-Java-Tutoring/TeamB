import java.util.Scanner;

class Circle {
	private double x, y;	
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; 
		this.y = y; 
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")"+ radius);
	}
	
}

public class Prob6 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle [3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();	 
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		for(int i=0; i<c.length; i++) 
			c[i].show();
		
		int tmp=0;
		
		for(int i=1; i<c.length; i++) {
			if(c[tmp].getRadius() < c[i].getRadius()) {
				tmp = i;
			}
		}
		System.out.print("가장 큰 면적인 원은 " ); c[tmp].show();
		
		scanner.close();
	}
}