package tn.dauphine.javaavance.jelassiyosra.shapes.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class  MouseController extends JPanel implements MouseMotionListener {
	
	int mx,my;
	
	public void mouseMoved(MouseEvent e) {
		mx=e.getX();
		my=e.getY();
		e.consume();}
		
	public void mouseDragged(MouseEvent e) {
		mx=e.getX()-10;
		my=e.getY()-10;
		e.consume();
	}
	

}
