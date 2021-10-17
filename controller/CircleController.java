package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Circle;
import view.CircleView;

public class CircleController extends JPanel implements MouseMotionListener{ 
	private JFrame frame;
	private Circle model;
	private CircleView view;

	public CircleController(Circle model, CircleView view, JFrame frame){
		addMouseMotionListener(this);   
		this.view = view; 
		this.model = model;
		this.frame = frame;
     }

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse dragged");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
//		System.out.println("Mouse moved");
//		System.out.println("center : "+model.getCenter());
		model.translate(arg0.getX() - model.getCenter().getX(), arg0.getY() - model.getCenter().getY());
		frame.repaint();
		
		
	}
	
	


}
