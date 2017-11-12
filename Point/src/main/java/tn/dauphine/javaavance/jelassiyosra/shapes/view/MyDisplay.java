package tn.dauphine.javaavance.jelassiyosra.shapes.view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import tn.dauphine.javaavance.jelassiyosra.shapes.model.world;

public class MyDisplay extends JPanel implements Observer {

	public world w;
	
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

