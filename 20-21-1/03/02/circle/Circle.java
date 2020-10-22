package circle;

import circle.utils.Point;

class Circle {
	private Point center;
	private double rad;
	
	public Circle(Point center, double rad) {
		this.center = center;
		this.rad = rad;
	}
	
	public Circle() {
		this.center = new Point();
		this.rad = 0;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public double getRad() {
		return rad;
	}
}
