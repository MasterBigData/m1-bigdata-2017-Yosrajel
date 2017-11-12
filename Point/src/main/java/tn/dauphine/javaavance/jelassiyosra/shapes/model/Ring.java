package tn.dauphine.javaavance.jelassiyosra.shapes.model;

public class Ring extends Circle {

	private int ri;
	
	public Ring(Point centre, int r,int ri) {
		super(centre,r);
		this.ri=ri;
	}
	public int getri() {	
		return ri;
		}
	public boolean equals(Circle c)
	{return (this.centre==c.centre)&&(this.r==c.r)&&(this.ri==ri);}
	
	public boolean contains(Point p) {
	return super.contains(p)	;	
	}
    
	
	
	
	public static void main(String[] args) {
		Point p=new Point (1,2);
		Circle c=new Circle(p,1);
		System.out.println(c.toString() +"ri");
	}
}