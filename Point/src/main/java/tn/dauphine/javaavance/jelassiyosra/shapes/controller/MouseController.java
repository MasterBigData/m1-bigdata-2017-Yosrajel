package tn.dauphine.javaavance.jelassiyosra.shapes.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MouseController extends JPanel implements MouseListener, MouseMotionListener {
	
	
 public int mx,my;
	
	public MouseController() {
	addMouseMotionListener(this);
	addMouseListener(this);}
	
	public void mouseMoved(MouseEvent e) {
		mx= e.getX();
		  my = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		


}
