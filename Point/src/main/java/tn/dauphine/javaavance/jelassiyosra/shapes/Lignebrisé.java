package tn.dauphine.javaavance.jelassiyosra.shapes;

import java.util.LinkedList;

public class Lignebrisé {
	private int nb;
	Point [] Ligne; 
	
	public Lignebrisé(int NB)
	 {Ligne=new Point[NB];
	nb=0;} 

	public void add(Point p)
	{nb++;
	if (nb<Ligne.length)
	Ligne[nb-1]=p;
	else
	System.out.println("Pas possible !");
	}
    /*2)une erreur survient qui indique qu'on a dépassé la capacité ou la taille du tableau*/
	
	public int pointCapacity(){
		return Ligne.length;
	}

	public int nbpoints(){
		return nb;
	}
	
	public void contains (Point p) {
		for(Point p1 : Ligne)  {
		if (p.equals(p1)) {System.out.println("le point est contenu dans la ligne brisée");}
		else System.out.println("le point n'est pas contenu dans la ligne brisée");}}
/*une erreur survient et si on va ajouter un add(null),le tableau ajoute une case nulle*/
	
	
	public Lignebrisé() {		
	LinkedList<Point> ligne2=new LinkedList<Point>();
	Point p1=new Point (1,2);
	ligne2.add(p1);
	ligne2.size();
	ligne2.contains(p1);
	}
    /*lorsequ'on a utilisé le Linkedlist ,on n'aurait plus besoin des méthodes pointcapacity,nbPoints et contains*/
	}



