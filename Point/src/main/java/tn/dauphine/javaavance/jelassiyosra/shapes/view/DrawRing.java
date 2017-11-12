package tn.dauphine.javaavance.jelassiyosra.shapes.view;

import java.awt.Graphics;

import tn.dauphine.javaavance.jelassiyosra.shapes.model.Ring;
import tn.dauphine.javaavance.jelassiyosra.shapes.model.Shape;

public class DrawRing extends DrawCircle{
		
		public DrawRing(Shape s) {
			super(s);
		}
		public void draw(Graphics g) {

			g.drawOval(((Ring) s).getCenter().getX(), ((Ring) s).getCenter().getY(), ((Ring) s).getr(),((Ring) s).getr());
			g.drawOval(((Ring) s).getCenter().getX(), ((Ring) s).getCenter().getY(), ((Ring) s).getri(),((Ring) s).getri());

			}

}
