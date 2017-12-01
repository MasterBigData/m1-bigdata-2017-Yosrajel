package fr.dauphine.javaavance.jelassiyosra.iterables.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

class Panel    {
	
    //la classe AbstractList permet un acces direct avec indice 
	// les méthodes abstraites à implémenter sont get() et size()
	
	public static List<Integer> panel(final int a,final int b){
	    return new AbstractList<Integer>() {
			@Override
			public Integer get(int index) {
				return a+index;
			}

			@Override
			public int size() {
				return b-a+1;
			}};}
	    	
  public static void main(String[] args) {
	  List<Integer> l = panel(3,6);
	   for(int i:l) {
	   System.out.println(i);
	   }
	  System.out.println(l.get(1)); 

	
}}
	
	//Pour pouvoir utiliser la "foreach" on doit implémenter l'interface
	//Iterable
//static Iterable<Integer> panel2(final int min,final int max){
//
//		return new Iterable<Integer>() {
//		int start=min;
//		int end=max;
//		 public Iterator<Integer> iterator() {	
//				return panel1(start,end);} };}
//	
//static Iterator<Integer> panel1(final int a,final int b){
//	 
//		return new Iterator<Integer>() {
//		int i=a;
//		public boolean hasNext() {
//		if (this.i<=b) { 
//		return true;}
//		else {return false;}}
//
//		public Integer next() {
//		if (hasNext()){
//		return i++;} 
//		else {throw new IllegalStateException("pas de next");}
//		}};}
//
//	
//	        	     
//    public static void main(String[] args) {
//    for(int i:panel2(1,5)) {
//     System.out.println(i);}}
//	    }
//
// 
//static Iterator<Integer> panel1(int min,int max){
//		
//		return new Implemiterator(min,max);}
//
//static class Implemiterator implements Iterator<Integer> {
//         int vald,valf;
//         Implemiterator(int vald,int valf){
//         this.vald=vald;
//         this.valf=valf;  
//          }
//public boolean hasNext() {
//	if (this.vald<=this.valf) { 
//	return true;}
//	else {return false;}}
//
//
//public Integer next() {
// if (hasNext()){
// return vald++;}
// throw new IllegalStateException("pas de next");}}
//
//public static void main(String[] args) {
//Iterator<Integer> it=panel1(1,5);
// for(;it.hasNext();)
// System.out.println(it.next()); }}
