package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

import model.Point;
import model.Circle;

public class CircleView extends JPanel{
	private Circle c; 
	
	public CircleView(Circle c) {
		this.c = c;
	}
	
	
	public void paintComponent(Graphics g) {
		 Ellipse2D.Double circle = new Ellipse2D.Double(
				 this.c.getCenter().getX(),
				 this.c.getCenter().getY(),
				 this.c.getRadius(), 
				 this.c.getRadius());
		Graphics2D g2d = (Graphics2D) g;
	     g2d.fill(circle);
	  }
	
	
}
