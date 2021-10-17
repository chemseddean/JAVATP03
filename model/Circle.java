package model;

import java.util.ArrayList;

public class Circle {
	private Point center; 
	private int radius;
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Center: "+center+
				" Radius: "+radius+
				" Area: "+this.area();
	}
	
	public void translate(int dx, int dy) {
		center.translate(dx, dy);
	}
	
	public void changeCenter(int x, int y) {
		this.center.translate(x - this.center.getX(), y - this.center.getY());
	}
	
	public Point getCenter() {
		// TODO Auto-generated method stub
		return this.center;
	}
	
	public int getRadius() {
		// TODO Auto-generated method stub
		return this.radius;
	}
	
	public double area() {
		return 3.14*(radius*radius);
	}
	
	public boolean contains(Point p) {
		double xs = Math.pow(p.getX() - this.center.getX(), 2);
		double ys = Math.pow(p.getY() - this.center.getY(), 2);
		double result = Math.sqrt(xs+ys);
		return result < this.radius;
	} 
	
	public boolean contains(Point p, Circle...circles) {
		ArrayList<Boolean> s = new ArrayList<>();
		for (Circle c : circles){
			double xs = Math.pow(p.getX() - this.center.getX(), 2);
			double ys = Math.pow(p.getY() - this.center.getY(), 2);
			double result = Math.sqrt(xs+ys);
			s.add(result < this.radius);
		}
		if (s.contains(true))
			return true;
		
		return false;
			
	}
}
