package tn.dauphine.javaavance.jelassiyosra.shapes.model;

import java.awt.Dimension;

import javax.swing.JFrame;
import tn.dauphine.javaavance.jelassiyosra.shapes.model.world;

import tn.dauphine.javaavance.jelassiyosra.shapes.view.MyDisplay;


public class TestPoint {
	
	
	public static void main(String[] args) {
	    JFrame frame=new JFrame("Java avance -Graphic Display");
		Point p1=new Point(100,50);
		Circle c1=new Circle(p1,200);
		Point p2=new Point(300,300);
		Circle c2=new Circle(p2,100);
		Ring r1 = new Ring(p1,200,100);
		Ring r2 = new Ring(p2,100,50);
		world w =new world ();
		w.add(c1);
		w.add(c2);
		w.add(r1);
		w.add(r2);
		MyDisplay m = new MyDisplay(w);
        w.addObserver(m);
        frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}}
