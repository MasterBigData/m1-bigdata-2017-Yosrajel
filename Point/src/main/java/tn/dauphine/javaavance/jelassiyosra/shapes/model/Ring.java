package tn.dauphine.javaavance.jelassiyosra.shapes.model;
import tn.dauphine.javaavance.jelassiyosra.shapes.view.DrawRing;
public class Ring extends Circle {

	private int ri;
	
	public Ring(Point centre, int r,int ri) {
		super(centre,r);
		this.ri=ri;
		ds = new DrawRing(this);
	}
	public int getri() {	

		return ri;
		}
	
	public boolean equals(Ring R){
	
	{return (this.centre==R.centre)&&(this.r==R.r)&&(this.ri==R.r);}}
	
	public boolean contains(Point p, Ring ...rings ) {
		for (Ring r: rings) {
			if  (r.contains(p)) return true;
			
		}
	return false ;}
	
	
	
	
	
}