package tn.dauphine.javaavance.jelassiyosra.shapes.view;
import java.util.Observable;
import java.util.Observer;
import java.awt.Graphics;
import javax.swing.*;

import tn.dauphine.javaavance.jelassiyosra.shapes.model.world;

public class MyDisplay extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  world w;
	
		 public MyDisplay(world w) {
		 this.w=w;
			}
			public void draw(Graphics g) {}
			protected void paintComponent(Graphics g)
			{for (int i=0;i<w.shapes.size();i++) {
				w.shapes.get(i).ds.draw(g);
			}}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}  }  

