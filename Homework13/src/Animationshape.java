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






public class Animationshape extends JComponent  {
protected int Ovalradius=25;
protected int OvalLocationX=0;
protected int OvalLocationY=0;
//int height = getHeight();
//int width = getWidth();
	@Override
	public void paintComponent(Graphics g){
		//int height = getHeight();
		//int width = getWidth();
		g.setColor(Color.RED);
		g.fillOval(OvalLocationX, OvalLocationY, Ovalradius, Ovalradius);
	}
	protected Timer timer;
	public Animationshape() {
		timer = new Timer(100, new TimerCallback()); // 100 ms = 0.1 sec
		timer.start();
	}
protected class TimerCallback implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			int height = getHeight();
			int width = getWidth();
			
			//OvalLocationX+=5; //this is the old one which does not adjust
			//OvalLocationY+=5;
			OvalLocationX+=width/100;//this is the new code that adjust the screen
			OvalLocationY+=height/100;
			//below is the code that do the restart part
			if (OvalLocationX==width){
				OvalLocationX=0;
				OvalLocationY=0;
			}
			repaint();
		}
}
public static void main(String[] args) {
	JFrame frame = new JFrame("AnimatedSquareCanvas");
	Animationshape canvas = new Animationshape();
	frame.add(canvas);
	frame.setSize(500,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	frame.setVisible(true);
}
}
