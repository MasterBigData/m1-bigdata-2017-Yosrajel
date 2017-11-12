package tn.dauphine.javaavance.jelassiyosra.shapes.view;


import java.awt.Graphics;

import tn.dauphine.javaavance.jelassiyosra.shapes.model.Circle;
import tn.dauphine.javaavance.jelassiyosra.shapes.model.Shape;


public class DrawCircle extends DrawableShape {
		public  DrawCircle (Shape s) {
		super(s);


	}
	
		public void draw(Graphics g) {
			g.drawOval(((Circle) s).getCenter().getX(), ((Circle) s).getCenter().getY(), ((Circle) s).getr(), ((Circle) s).getr());		
		}

}
