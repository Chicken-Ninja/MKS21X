import javax.swing.*;
import java.awt.*;

public class Temperature extends JFrame {
    private Container pane; 
    private JCheckBox A;
    private JTextField t; 
    
    

    public Temperature() {
	this.setTitle("Temperature GUI");
	this.setSize(600 , 600);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	A = new JCheckBox("Celcius to Fahrenheit");

	t = new JTextField(15); 

	pane.add(A);
	pane.add(t);
    }

    //public void actionPerformed(ActionEvent e) {
    //	String s = e.getActionCommand();
    //	System.out.println(s);
	
    
    
    public static double CtoF (double temp) {
	return temp * (1.8) + 32;}

    public static double FtoC (double temp) {
	return (temp - 32) / 1.8;}
    
    
    public static void main(String[] args) {
	System.out.println(CtoF(-40.0));
	System.out.println(FtoC(212.0));
	System.out.println(CtoF(100.0));
	Temperature a = new Temperature();
	a.setVisible(true);
    }
}
