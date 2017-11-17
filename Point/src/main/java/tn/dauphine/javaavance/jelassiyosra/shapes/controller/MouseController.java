package tn.dauphine.javaavance.jelassiyosra.shapes.controller;

import java.awt.Container;
import java.awt.event.MouseEvent;


import java.awt.event.MouseMotionListener;


import tn.dauphine.javaavance.jelassiyosra.shapes.view.MyDisplay;

public class MouseController implements MouseMotionListener {
	public MyDisplay m;
	int mx,my;

	
	public MouseController(MyDisplay m) {
		this.m=m;
	this.m.addMouseMotionListener(this);}
	
	
	public void mouseMoved(MouseEvent e) {
	this.m.w.shapes.get(0).getCenter().setX(e.getX());
	this.m.w.shapes.get(0).getCenter().setY(e.getY());
	this.m.repaint();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
	
		
	}

	
}
