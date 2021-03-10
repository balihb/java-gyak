class Point {
	double x, y;
	void move( double dx, double dy ){
		x += dx;
		y += dy;
	}
	void mirror( Point center ){
		x = 2*center.x-x;
		y = 2*center.y-y;
	}
	double distance( Point that ){
		double dx = x - that.x,
		       dy = y - that.y;
		return Math.sqrt( dx*dx + dy*dy );
	}
}
