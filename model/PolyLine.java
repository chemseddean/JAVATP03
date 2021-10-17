package model;

import java.util.LinkedList;
import java.util.List;

public class PolyLine {
	
	private List<Point> poly;
//	private int nbmax; 
//	private int index = 0; 
	 
	public PolyLine(
//			int nbmax
			) {
//		this.nbmax = nbmax;
//		 poly = new Point[this.nbmax];
		poly = new LinkedList<>();
	}
	
	public void add(Point p) {
//		if (index < this.nbmax) {
//			poly[index] = p;
//			index++;	
//		}
//		else {
//			System.out.println("IndexOutOfBounds");
//		}
		poly.add(p);
	}
	
	public int pointCapacity() {
//		return poly.length;
		return poly.size();
	}
	
	public int nbPoints() {
		int result = 0; 
		for (Point p : poly) {
			if (p != null)
				result+=1;
		}
		return result;
	}
	
	public boolean contains(Point p1) {
//		for (Point p : poly) {
//			if (p.getX() == p1.getX() && p.getY() == p1.getY())
//				return true;
//		}
//		return false;
		return poly.contains(p1);
	}
	
	
	
}
