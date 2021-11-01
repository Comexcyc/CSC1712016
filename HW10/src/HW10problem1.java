/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:10
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
public class HW10problem1 extends JComponent { 
	@Override
	public void paintComponent(Graphics g) {
		
		int height = getHeight();
		int width = getWidth();
		System.out.println("width=" + width + ", height=" + height);
		g.setColor(Color.green);
		g.drawLine(0,  0,width-1, height-1);
		
		g.drawLine(width-1,0, 0, height-1);
		g.setColor(Color.blue);
		g.drawLine(width/2,0,width/2,height);
		g.setColor(Color.red);
		g.drawRect(0, 0, width-1, height-1);
	
	}
	}
