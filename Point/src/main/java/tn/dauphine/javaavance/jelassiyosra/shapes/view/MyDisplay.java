package tn.dauphine.javaavance.jelassiyosra.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel{
	public static void main (String [] args) {
		JFrame frame=new JFrame("Java avance -Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}
	public void paintComponent (Graphics g){

	    super.paintComponent(g);
	    g.drawLine(25, 25,50, 50);
	    }
//*5)la methode paintcomponent()est appele lors du premier affichage de JPanel et lors son constructeur super.pqintComponent()*//
//*6)lq difference fondamentale entre le package java.awt et javax.swing est la rapidite,les composants awt sont considere lourd 
	//*contrairement qux composants swing*//
	
}
