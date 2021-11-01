/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:10
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/



import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
public class HW10Problem5 extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		int height = getHeight();
		int width = getWidth();
		int z=0;
		int d=0;
		int a=0;
		int b=height;
		int s=height;
		int q=width;
		int y=0;
		int e=width;
			
		for(int c=15;c>=0;c--)
		
		{
		z=z+height/15;
		d=d+width/15;
				
		g.setColor(Color.BLUE);
					g.drawLine(0,z, d, height);}

		for(int c=15;c>=0;c--)
			
		{
		b=b-height/15;
		a=a+width/15;
				
		g.setColor(Color.BLUE);
					g.drawLine(0,b, a, 0);}

	
	
for(int c=15;c>=0;c--)
			
		{
		s=s-height/15;
		q=q-width/15;
				
		g.setColor(Color.BLUE);
					g.drawLine(width,s, q, 0);}

for(int c=15;c>=0;c--)
	
{
y=y+height/15;
e=e-width/15;
		
g.setColor(Color.BLUE);
			g.drawLine(width,y, e, height);}
	
	
	
	}

	}



