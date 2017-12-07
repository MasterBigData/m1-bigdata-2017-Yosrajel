package fr.dauphine.javaavance.jelassiyosra.iterables.iterables;

	import java.util.AbstractList;
	import java.util.AbstractSequentialList;
	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.ListIterator;

	public class Mult {
			
		public static List<Integer> mult(final int j,final List<Integer> l3){
			
		if (l3 instanceof AbstractList)
		{return new AbstractList <Integer>() {

			@Override
			public Integer get(int index) {
				return (j*l3.get(index));
			}

			@Override
			public int size() {
				return l3.size();
			}

			@Override
			public ListIterator<Integer> listIterator(int index) {
				ListIterator<Integer> li=l3.listIterator();

			    return li;
			  		}};}
		
		else 
		{return new AbstractSequentialList<Integer>() {
	
			@Override
			public Integer get(int index) {
				return (j*l3.get(index)-5);
			}
	
			@Override
			public int size() {
				return l3.size();
			}

			@Override
			public ListIterator<Integer> listIterator(int index) {
				ListIterator<Integer> li=l3.listIterator();

			    return li;
			  		}};}}		
		
	
	         	
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
			al.add(i);
			}
			long t0 = System.nanoTime();
			List<Integer> ret = Mult.mult(2, al);
			System.out.println(ret);
			long sum=0;
			for(int val : ret) {
			sum+=val/2;
			}
			System.out.println((System.nanoTime() - t0));
			LinkedList<Integer> ll = new LinkedList<>();
			for (int i = 0; i < 10; i++) {
			ll.add(i);
			}
			t0 = System.nanoTime();
			List<Integer> ret1 = Mult.mult(2, al);
		    sum=0;
			ret1 = Mult.mult(2, ll);
			System.out.println(ret1);
			/*for(int val : ret) {
			sum+=val/2;
			}*/
			System.out.println((System.nanoTime() - t0));}}
	
//	//Question2:
//		
//		public static List<Integer> mult(final int j,final List<Integer> l3){		
//		return new AbstractList<Integer>() {
//	
//			@Override
//			public Integer get(int index) {
//				return j*l3.get(index);
//			}
//	
//			@Override
//			public int size() {
//				return l3.size();
//			}};}		
//		
		
	//Question 1
		
//	public static List<Integer> mult(final int j,final List<Integer> l3){
//			
//			List<Integer> l=new ArrayList<Integer>();
//			
//			for (int i=0;i<l3.size();i++) {
//				l.add(l3.get(i)*j);
//			}
//			return l;
//		}	
//	}

	
