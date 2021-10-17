package model;

public class Ring extends Circle {

	private int innerRadius;
	public Ring(Point center, int outerRadius, int innerRadius) {
		super(center, outerRadius);
		this.innerRadius = innerRadius;
	}
	
	public boolean equals(Ring r) {
		return true;
	} 
	
	public String toString() {
		return super.toString() + " rayon interne : "+this.innerRadius;
	}
	
	public boolean contains(Point p) {
		return super.contains(p);
	}
	
	public boolean contains(Point p, Ring...rings) {
		return super.contains(p, rings);
	}

}
