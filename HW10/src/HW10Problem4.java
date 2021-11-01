/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:10
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
public class HW10Problem4 extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		int height = getHeight();
		int width = getWidth();
		int z=0;
		int d=0;
		for(int c=15;c>=0;c--)
		
		{
		z=z+height/15;
		d=d+width/15;
				
		g.setColor(Color.BLUE);
					g.drawLine(0,z, d, height);}

	
	
	
	
	}

	}


