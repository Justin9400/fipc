package fipc;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

public class GUI extends TextField
{ 
    public void GUI()
    {
    	int height = 0, width;
    	
    	Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); //Gets the screen resolution
    	
    	JFrame frame = new JFrame("Financial Investment Profit Calculator"); //Title of the window
    	JPanel panel = new JPanel();
    	Window Window = new Window(size, frame);
    	TextField tf = new TextField();
    	setLayout(null);
    	//Creates new text fields with 16 columns  	
    	tf1 = new JTextField(16); 

    	/*
    	for (JTextField jtf : textFieldsArray)
    	{
    		tf.TextField(jtf);
    	}
		*/
    	
    	//Scratch  swingControlDemo = new Scratch();      
        //swingControlDemo.showTextFieldDemo();
    	//Creates new buttons
    	b1 = new JButton("Calculate"); 
    	
        //addActionListener to button
    	b1.addActionListener(tf);
        
    	//Dimension tf1Size = tf1.getPreferredSize();
    	
    	//tf1.setBounds(100, 500, tf1Size.width, tf1Size.height);

        //Adds text fields to the window
    	panel.add(tf1);
        
        //Adds button to the window
        panel.add(b1); 
    	
    	frame.add(panel); //Adds the panel to the frame    
    	
    	frame.setVisible(true); //Sets if the window is visible
  
    }
}

