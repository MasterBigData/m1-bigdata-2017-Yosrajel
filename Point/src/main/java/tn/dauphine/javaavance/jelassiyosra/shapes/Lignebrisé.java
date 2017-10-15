package tn.dauphine.javaavance.jelassiyosra.shapes;

import java.util.LinkedList;
/*Exercice 3*/
public class Lignebrisé {
	private int nb;
	Point [] Ligne; 
	LinkedList Ligne2;

	
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
		if (p==p1) {System.out.println("le point est contenu dans la ligne brisée");}
		else System.out.println("le point n'est pas contenu dans la ligne brisée");}}
	
	public Lignebrisé() {
		LinkedList Ligne2 = new LinkedList();}
	
	public int nbpoints2(){
		return Ligne2.size();
	}
	}



