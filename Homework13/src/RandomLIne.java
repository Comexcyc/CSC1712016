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
import java.awt.BorderLayout;
import javax.swing.BoundedRangeModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import java.util.Random;
import javax.swing.JLabel;
public class RandomLIne extends JComponent    {
	
	Random location=new Random();

public static int a;
//int slidervalue;



	@Override
	public void paintComponent(Graphics g) {
		for(int i=0;i<=a;i++){
			int Xlocation=location.nextInt(1000);
			int Ylocation=location.nextInt(1000);
			int Zlocation=location.nextInt(1000);
			int Slocation=location.nextInt(1000);
		
	g.drawLine(Xlocation, Ylocation, Zlocation, Slocation);}}
	protected Timer timer;
	public RandomLIne() {
	
		timer = new Timer(5000, new Time()); // 100 ms = 0.1 sec
	timer.start();
	
	//frame.setVisible(true);
	
	
	}
	protected class Time implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			repaint();
		}
	
	}public static void main(String[] args) {
		
		JFrame frame = new JFrame("RandomLine");
		RandomLIne canvas = new RandomLIne();
		frame.add(canvas);
		
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
		JLabel label = new JLabel("number of lines to paint");
		
		JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 0);
		 frame.add(slider);
		 
		slider.addChangeListener(new ChangeListener() {
		      public void stateChanged(ChangeEvent event) {
		    	  int value = slider.getValue();
		    	  label.setText("Number of lines"+Integer.toString(value));
		    	  a=value;frame.add(label);}});
		    	  
	}}

	

/*public static void main(String[] args) {
	JFrame frame = new JFrame("Random Line");
	RandomLIne canvas = new RandomLIne();
	frame.add(canvas);
	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	frame.setVisible(true);
}public static void main(String[] args) {
	new RandomLIne().setVisible(true);
	JFrame frame = new JFrame("RandomLIne");
	RandomLIne canvas = new RandomLIne();
	frame.add(canvas);
	frame.setSize(1000, 1000);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	frame.setVisible(true);
	 
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 0);
	    
	 int value = slider.getValue();
	
	slider.addChangeListener(new ChangeListener() {
	      public void stateChanged(ChangeEvent event) {
	    	  //int value = slider.getValue();
	    	 
	    	
	    	  }
}); frame.add(slider);
	 }*/



	
