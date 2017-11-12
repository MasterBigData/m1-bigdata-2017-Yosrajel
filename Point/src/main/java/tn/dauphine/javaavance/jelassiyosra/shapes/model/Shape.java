package tn.dauphine.javaavance.jelassiyosra.shapes.model;

import tn.dauphine.javaavance.jelassiyosra.shapes.view.DrawableShape;

public class Shape  {

public DrawableShape ds ;
protected Point centre;

public Shape (Point centre) {
this.centre=centre;
}
public Point getCenter() {
	return centre;
}
	

}

