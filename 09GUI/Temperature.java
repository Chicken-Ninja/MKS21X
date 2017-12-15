import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperature extends JFrame implements ActionListener{
    private Container pane; 
    private JCheckBox A , B ;
    private JTextField t,c;
    private JButton Submit;
    
    

    public Temperature() {
	this.setTitle("Temperature GUI");
	this.setSize(600 , 600);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	A = new JCheckBox("Celcius to Fahrenheit");
	B = new JCheckBox("Fahrenheit to Celcius"); 
	c = new JTextField(15);
	t = new JTextField(15); 
	Submit = new JButton("Submit");

	A.addActionListener(this);
	B.addActionListener(this);
	t.addActionListener(this);
	c.addActionListener(this);
	Submit.addActionListener(this);
	pane.add(Submit);
	pane.add(B);
	pane.add(t);
	pane.add(A);
	pane.add(c);
    }

    public void actionPerformed(ActionEvent e) {
    	String s = e.getActionCommand();
    	System.out.println(s);
	if(s.equals("Submit"))
	    {	if(A.isSelected() && B.isSelected() ) {
		   c.setText("Choose one option!");
		   }
		else{


		if(A.isSelected() )
		    {c.setText("" + CtoF(Double.parseDouble(t.getText())));}
		if(B.isSelected() ) 
		    {c.setText("" + FtoC(Double.parseDouble(t.getText())));}
	    		}
	    }
    }


       
		    
	
    
    
    public static double CtoF (double temp) {
	return temp * (1.8) + 32;}

    public static double FtoC (double temp) {
	return (temp - 32) / 1.8;}
    
    
    public static void main(String[] args) {
	//System.out.println(CtoF(-40.0));
	//System.out.println(FtoC(212.0));
	//System.out.println(CtoF(100.0));
	Temperature a = new Temperature();
	a.setVisible(true);
    }
}
