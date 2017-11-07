package tn.dauphine.javaavance.jelassiyosra.shapes.controller;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MouseController extends JPanel implements MouseMotionListener {
	
	int mx,my;
	Frame frame=new Frame ();
	public MouseController() {
	super();
	addMouseMotionListener(this);}
	
	public void mouseMoved(MouseEvent e) {
		
		  mx = e.getX();
		  my = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	
		
	}
		


}
