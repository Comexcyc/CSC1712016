/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:10
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.awt.Graphics;

import javax.swing.JFrame;

public class HW10Problem5test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("CanvasTest");
		HW10Problem5 canvas = new HW10Problem5();
		frame.add(canvas);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
