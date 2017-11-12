package tn.dauphine.javaavance.jelassiyosra.shapes.model;

import tn.dauphine.javaavance.jelassiyosra.shapes.view.DrawCircle;

public class Circle extends Shape {
    int r;
    	
	protected Point centre; 	
	public Circle(Point centre,int r) {
        super(centre);
		this.r=r;	
		this.ds = new DrawCircle( this);

		}
	
	public int getr() {	
	return r;
	}
	
	public String ToString()
	{return 
			"(le centre du cercle :"+centre+", de rayon "+r+")";}
	
	public void translate(int dx, int dy)
	{dx=centre.getX()+dx;
	 dy=centre.getY()+dy;
	}
	
	public double surface() {
		return Math.PI*r*r;
		
	}
	
	public boolean contains(Point p) {
		double d;
		double abs;
		double ord;
		abs=Math.pow(p.getX()-centre.getX(),2);
		ord=Math.pow(p.getY()-centre.getY(),2);
		d=abs + ord;
		return d<=Math.pow(r,2);		
	}

	public boolean contains(Point p,Circle... Cercles) {
		for ( Circle C : Cercles) {
			if (C.contains(p)) {return true;}
		}
		return false;
		}
	

}
