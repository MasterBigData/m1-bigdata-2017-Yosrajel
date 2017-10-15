package tn.dauphine.javaavance.jelassiyosra.shapes;

public class Ring extends Circle {

	private float ri;
    /* oui il est interssant d'utiliser l'héritage puisque un anneau se compose de deux cercles*/
	public Ring(Point p, float r,float ri) {
		super(p, r);
		this.ri=ri;
	}
	public boolean equals(Circle c)
	{return (this.r==c.r)&&(this.ri==ri);}
	
	/*ça va afficher un hashcode*/
	
	public static void main(String[] args) {
		Point p=new Point (1,2);
		Circle c=new Circle(p,1);
		System.out.println(c.toString() +"ri");
	}
}