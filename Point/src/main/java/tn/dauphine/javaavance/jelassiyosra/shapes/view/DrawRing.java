package tn.dauphine.javaavance.jelassiyosra.shapes.view;

import java.awt.Graphics;
import tn.dauphine.javaavance.jelassiyosra.shapes.model.Ring;
import tn.dauphine.javaavance.jelassiyosra.shapes.model.Shape;

public class DrawRing extends DrawCircle{
		
		public DrawRing(Shape s) {
			super(s);
		}
		public void draw(Graphics g) {
			super.draw(g);
			g.drawOval(((Ring) s).getCenter().getX()-((Ring) s).getri(), ((Ring) s).getCenter().getY()-((Ring) s).getri(), ((Ring) s).getri()*2,((Ring) s).getri()*2);
		

			}

}
