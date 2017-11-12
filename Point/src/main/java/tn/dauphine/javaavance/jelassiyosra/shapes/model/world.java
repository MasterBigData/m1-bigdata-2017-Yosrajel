package tn.dauphine.javaavance.jelassiyosra.shapes.model;


import java.util.ArrayList;
import java.util.Observable;

public class world extends Observable{

	public ArrayList<Shape> shapes=new ArrayList <Shape>();	
	public void add(Shape s) {
	shapes.add(s);
	 notifyObservers();}

}
