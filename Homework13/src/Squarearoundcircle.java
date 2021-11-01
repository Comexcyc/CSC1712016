/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:13
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.Timer;





public class Squarearoundcircle extends JComponent {
	double a=0;
	int height = getHeight();
	int width = getWidth();
	//protected int =;
	protected int SquareLocationX=getWidth()/2;
	protected int SquareLocationY=height/2-15;
	protected int widthsquare=30;
	protected int heightsquare=30;
	@Override
	public void paintComponent(Graphics g){
		
		g.setColor(Color.RED);
	g.fillRect(SquareLocationX,SquareLocationY, widthsquare, heightsquare);
	
	}
	protected Timer timer;
	public Squarearoundcircle() {
		timer = new Timer(100, new TimerCallback()); // 100 ms = 0.1 sec
		timer.start();
	}
protected class TimerCallback implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
		
			SquareLocationX=getWidth()/2+(int)(100*Math.cos(a));
			SquareLocationY=getHeight()/2-(int)(100*Math.sin(a));
			
			a=a+0.1;
			//the square will stop after one full circle
			if(a>=6.28+1.57){
				timer.stop();
			}
			repaint();
	}}
public static void main(String[] args) {
	JFrame frame = new JFrame("AnimatedSquareCanvas");
	Squarearoundcircle canvas = new Squarearoundcircle();
	frame.add(canvas);
	frame.setSize(500,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	frame.setVisible(true);
}
}
