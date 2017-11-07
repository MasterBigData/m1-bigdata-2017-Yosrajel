package tn.dauphine.javaavance.jelassiyosra.shapes.model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Line extends Shape{
  protected Point p1;
  protected Point p2;

  public Line( Point p1, Point p2) {
	  super();
    this.p1 = p1;
    this.p2 = p2;
  
  
  }
  public void draw(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.drawLine(p1.x, p1.y, p2.x,
        p2.y);
  }
@Override
void draw() {
	
}
	
}

