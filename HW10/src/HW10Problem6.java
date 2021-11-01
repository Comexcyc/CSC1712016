/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:10
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
public class HW10Problem6 extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		int height = getHeight();
		int width = getWidth();
		
	    g.setColor(Color.cyan);
		g.drawOval(width/2-10, height/2-10, 20, 20);
		g.setColor(Color.gray);
		g.drawOval(width/2-20, height/2-20,40,40);
	   
		g.setColor(Color.red);
		g.drawOval(width/2-30, height/2-30,60,60);
		g.setColor(Color.green);
		g.drawOval(width/2-40, height/2-40,80,80);
		g.setColor(Color.green);
		g.drawOval(width/2-50, height/2-50,100,100);
		g.setColor(Color.blue);
		g.drawOval(width/2-60, height/2-60,120,120);
		g.setColor(Color.magenta);
		g.drawOval(width/2-70, height/2-70,140,140);
		g.setColor(Color.pink);
		g.drawOval(width/2-80, height/2-80,160,160);
		g.setColor(Color.yellow);
		g.drawOval(width/2-90, height/2-90,180,180);
		g.setColor(Color.orange);
		g.drawOval(width/2-100, height/2-100,200,200);
		g.setColor(Color.lightGray);
		g.drawOval(width/2-110, height/2-110,220,220);
		g.setColor(Color.darkGray);
		g.drawOval(width/2-120, height/2-120,240,240);
	}

	}

