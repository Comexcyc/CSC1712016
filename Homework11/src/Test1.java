
/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:11
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import javax.swing.JFrame;

/**
 * Test a CanvasWithMouseMotionListener.
 */
public class Test1 {


	public static void main(String[] args) {

		// Create an instance of a JFrame
		JFrame frame = new JFrame("Test1");
		// Create an instance of your JPanel subclass (now with built-in listener!)
		Canvas canvas = new Canvas();
		// ...and add it to the frame
		frame.add(canvas);
		// Set frame behavior and size and make it visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}

}
