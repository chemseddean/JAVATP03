import java.awt.Dimension;

import javax.swing.JFrame;

import controller.CircleController;
import model.Circle;
import model.Point;
import view.CircleView;
import view.MyDisplay;

public class Main{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avanc´e - Graphic Display");
		
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		Circle circle = new Circle(new Point(50,50), 100);
		CircleView circleView = new CircleView(circle);
		System.out.println(circle.getCenter());
		CircleController controller = new CircleController(circle, circleView, frame);
		
		
		frame.add(circleView);
		frame.addMouseMotionListener(controller);
	       }



	}

