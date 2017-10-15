package tn.dauphine.javaavance.jelassiyosra.shapes;

public class Circle {
	float r;
	private Point p;

	public Circle (Point p,float r) {
	   this.p=p;
	   this.r=r;		
	}
	public String ToString()
	{return "("+p+","+r+")";}
	
	public void translate(float dx, float dy)
	{dx=p.getX()+dx;
	 dy=p.getY()+dy;
	}
	public static void main () {
		Point p=new Point (1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		System.out.println(c+"  "+c2);
		/*un hashcode va s'afficher,on doit utiliser toString*/
		
	}
}
