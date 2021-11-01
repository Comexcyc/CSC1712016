/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:12
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
//import javax.swing.event.JCheckBox
public class HW12 extends JFrame implements ActionListener {
	protected JLabel label;
	protected JButton button;
	protected JButton button2;
	protected JLabel label2;
	protected JLabel label3;
	protected JLabel label4;
	protected JLabel label5;
	protected JButton button3;
	protected JTextField textField;
	int i=0;
	public HW12(){
	setTitle("HW12");
	setSize(300, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(new FlowLayout());
	//add(new JButton("Button"));
	label = new JLabel("I am a label");
	add(label);
	 //below is the code for slider
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 150, 25);
	 slider.addChangeListener(new ChangeListener() {
	      public void stateChanged(ChangeEvent event) {
	    	  int value = slider.getValue();
	    	  label4.setText("Slider Value:"+Integer.toString(value));}});
	    	  add(slider);
	button = new JButton("Click me!");
	button.addActionListener(this);
	add(button);
	label2 = new JLabel("off");
	add(label2);
	label3 = new JLabel("“user input”");
	add(label3);
	label4 = new JLabel("Label value");
	add(label4);
	label5 = new JLabel("“Checkbox Status”");
	add(label5);
	//below is the code for the bottom on and off
	button2= new JButton("On");
	button2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		turnon();}});
		button3= new JButton("off");
		button3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			turnoff();
	}});
	add(button2);
	add(button3);
	//below is the code for the textfield
	textField = new JTextField(20);
    textField.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		label3.setText(textField.getText());
	}});add(textField);
	//the following code is for two checkbox
	JCheckBox checkbox1=new JCheckBox("checkbox1");
	checkbox1.addItemListener(new ItemListener(){
	public void itemStateChanged(ItemEvent e){
		label5.setText("checkbox 1 was checked");
	}});add(checkbox1);
	JCheckBox checkbox2=new JCheckBox("checkbox2");
	checkbox2.addItemListener(new ItemListener(){
	public void itemStateChanged(ItemEvent e){
		label5.setText("checkbox 2 was checked");
	}});add(checkbox2);
	}
protected void turnon(){
	label2.setText("turned on");
}
protected void turnoff(){
	label2.setText("turned off");
}
public void actionPerformed(ActionEvent e) {
//System.out.println(e);

System.out.println(e);
i=i+1;
label.setText("Button was clicked for"+" "+i+" times");
}
public static void main(String[] args) {
	new HW12().setVisible(true);
}
}
