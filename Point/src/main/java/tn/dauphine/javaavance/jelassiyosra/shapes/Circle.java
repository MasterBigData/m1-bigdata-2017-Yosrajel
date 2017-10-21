package tn.dauphine.javaavance.jelassiyosra.shapes;

public class Circle {
	private static final boolean True = false;
	float r;
	protected Point centre; 
	
	public Circle (Point centre,float r) {
	   this.centre=centre;
	   this.r=r;		
	}
	public String ToString()
	{return "(le centre du cercle :"+centre+", de rayon "+r+")";}
	
	public void translate(float dx, float dy)
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
	
	public boolean contains(Point p,Circle ...circles) {
		for(Circle c1 : circles) {
			if (contains(p)==True) return True; }
		}
	
	public static void main () {
		Point p=new Point (1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c.toString()+"de surface "+c.surface()+"  "+c2.toString()+"de surface "+c2.surface());
		/*retourne le point copie de centre */
		/**Circle c=new Circle (new Point(1,2),1);
		c.getCenter().translate(1,1);
		System.out.println(c);**/
		
	}
}
