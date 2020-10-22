package circle;

import circle.utils.Point;


public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(new Point(1, 2), 3);
		System.out.println(circle.getRad());
		System.out.println(circle.getCenter().getX());
		
		System.out.println(new Circle(new Point(4, 5), 6).getCenter().getX());
	}
}
