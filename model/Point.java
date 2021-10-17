package model;

public class Point {
	private int x, y; 
	
	public void meth1() {
//		Point p = new Point(); 
//		System.out.println(p.getX() +" "+p.getY());
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Point(int px, int py) {
		x = px; 
		y = py;
	}
	
	public Point(Point p2) {
		x = p2.x; 
		y = p2.y;
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+","+y+")";
	}
	
	public boolean isSameAs(Point p) {
		if ((this.x == p.x) && (this.y == p.y)) return true; 
		else return false;
	}
	
	public void translate(int dx, int dy) {
		this.x += dx; 
		this.y += dy;
	}
}
