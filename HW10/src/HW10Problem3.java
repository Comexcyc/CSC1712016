/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:10
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
public class HW10Problem3 extends JComponent {
	
	
	@Override
	public void paintComponent(Graphics g) {
		int height = getHeight();
		int width = getWidth();
		int b=height;
		int d=0;
		int k=width;
		int e=0;
		int f=0;
		int o=0;
		int v=0;
		int x=0;
		for(int c=15;c>=0;c--)
		
		{
		b=b-height/15;
		d=d+width/15;
				
		g.setColor(Color.BLUE);
					g.drawLine(0,0, d, b);}
		for(int c=15;c>=0;c--)
			
		{
		e=e+height/15;
		k=k-width/15;
				
		g.setColor(Color.BLUE);
					g.drawLine(width,height, k, e);}

for(int c=15;c>=0;c--)
			
		{
		o=o+height/15;
		f=f+width/15;
				
		g.setColor(Color.BLUE);
					g.drawLine(width,0, f, o);}
for(int c=15;c>=0;c--)
	
{
x=x+height/15;
v=v+width/15;
		
g.setColor(Color.BLUE);
			g.drawLine(0,height, x, v);}

	
	
	
	
	
	
	
	
	}

	}

