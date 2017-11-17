package tn.dauphine.javaavance.jelassiyosra.shapes.model;
import java.util.ArrayList;


public class Point 
{private int x;
private int y;

public int getX()  {  
return x;
  }
public int getY()  {  
    return y;
  }
public void setX(int x) {
	this.x=x;
	}
public void setY(int y) {
	this.y=y;
}
/*les variables x et y sont des variables de classe*/
public Point(int x,int y) {

	this.x=x;
	this.y=y;

}

/*5)la création de point au niveau du main se fait  sans paramètres*/
/*6) on ajoute this */

public Point (Point p) {
this(p.x,p.y);
}
/* 8)le compilateur sait le contructeur a appeler à travers les paramètres lors de l'appel*/


public String ToString()
{return "("+x+","+y+")";}

public void translate(int dx, int dy)
{x=x+dx;
 y=y+dy;
}

public boolean IsSameAs(Point p) {
return (p.x==this.x && p.y==this.y) ;}


public static void main () {
	Point p1=new Point(1,2);
	Point p2=p1;
	Point p3=new Point(1,2);
    System.out.println(p1==p2);
	System.out.println(p1==p3);
	/*le systeme va pointer les cases mémoires et afficher un True pour p1==p2 et un false pour p1==p3*/
	ArrayList<Point>list=new ArrayList<>();
	list.add(p1);
	System.out.println(list.indexOf(p2));
	System.out.println(list.indexOf(p3));}


	
	
}
/*3)indexof retourne l'indice des points s'l existe sinon(-1)*/



