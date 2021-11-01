/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:11
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
/**
 * A Canvas that handles its own MouseListener events.
 * Also illustrates getting event coordinates for use in listener methods.
 */
public class Canvas extends JComponent implements MouseListener,MouseMotionListener,KeyListener {
	
	public Canvas() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		setFocusable(true);
	}
	int initiala ;
	int initialb;
	int finala;
	int finalb;
	int previousa;
	int previousb;
	//Graphics g = getGraphics();
	Color color=Color.black;
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("CanvasListener.mouseClicked");
		int a = e.getX();
		int b= e.getY();
		
		Graphics g = getGraphics();
		//g.setColor(Color.BLUE);
		g.fillOval(a, b, 10, 10);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mousePressed");
		 initiala=e.getX();
		 initialb=e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mouseReleased");
int x = e.getX();
		
		
		int y = e.getY();
		Graphics g = getGraphics();
		g.drawLine(initiala, initialb, finala, finalb);
	g.clearRect(0,15,2000,2000);
	 g.fillOval(x, y, 10, 10);
	 g.drawLine(initiala, initialb, finala, finalb);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mouseExited");
	}
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("Canvas.paintComponent");
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println("CanvasWithMouseMotionListener.mouseMoved");
	}
	
	
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("CanvasWithMouseMotionListener.mouseDragged");
		
		int x = e.getX();
		
		
		int y = e.getY();
		 finala = e.getX();
		 finalb = e.getY();
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x, y, 10, 10);
		//g.setColor(Color.blue);
		g.drawLine(initiala, initialb, finala, finalb);
	}
	 //below is code for problem that print out the characters that user enters
	public void keyTyped(KeyEvent e) {
	        System.out.println( "KEY TYPED: ");
	    }
	int i=0;
	public void keyPressed(KeyEvent e) {
	        System.out.println( "KEY PRESSED: ");
	      i=i+10;
	       int colorvalue=e.getKeyCode();
	       Graphics g = getGraphics();
	       
	       if(colorvalue==49){
	    	    color=Color.blue;
	    	   //Graphics g = getGraphics();
	    	  // g.setColor(color);
	       }else if(colorvalue==50){
	    	   color=Color.red;
	       }else if(colorvalue==51){
	    	   color=Color.yellow;
	       }
	       g.setColor(color);
	       char kh=e.getKeyChar();
	    		System.out.println("Key printed");
	    		//Graphics g = getGraphics();
	    		
	    		g.drawString(String.valueOf(kh),i,20);
	    		//g.setColor(a);
	    }
	
	 public void keyReleased(KeyEvent e) {
		 System.out.println("Key Released");
	 }
	/* getKeyChar(char a[]){
		System.out.println("Key printed");
		Graphics g = getGraphics();
		
		g.drawChars(a,0,6, 1, 300);
		return a;*/
		
		
	}



