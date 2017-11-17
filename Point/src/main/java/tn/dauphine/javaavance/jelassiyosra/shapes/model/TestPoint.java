package tn.dauphine.javaavance.jelassiyosra.shapes.model;

import java.awt.Dimension;

import tn.dauphine.javaavance.jelassiyosra.shapes.controller.MouseController;
import tn.dauphine.javaavance.jelassiyosra.shapes.model.world;
import tn.dauphine.javaavance.jelassiyosra.shapes.view.MyDisplay;
import javax.swing.JFrame;
public class TestPoint {
	
	
	public static void main(String[] args) {
		Point p1=new Point(100,50);
		Circle c1=new Circle(p1,100);
		Point p2=new Point(300,300);
		Circle c2=new Circle(p2,50);
		/*Ring r1 = new Ring(p1,350,250);
	   /* Ring r2 = new Ring(p2,200,100);*/
	    JFrame frame=new JFrame("Java avance -Graphic Display");
		world w =new world ();
	w.add(c1);
		/*w.add(c2);
		/*w.add(r1);
        w.add(r2);*/
		MyDisplay m = new MyDisplay(w);
        w.addObserver(m);
        frame.add(m);
		//**frame.add(object);
        frame.setSize(new Dimension(4000,4000));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MouseController mc=new MouseController(m);

}}
