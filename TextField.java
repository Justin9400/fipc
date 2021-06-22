package fipc;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

class TextField extends JFrame implements ActionListener 
{
	public static JTextField tf1, tf2, tf3, tf4, tf5, tf6;

	
	//public JTextField [] textFieldsArray = new JTextField[] {tf1, tf2, tf3, tf4, tf5, tf6};
	
	public static JButton b1, b2, b3, b4, b5, b6;
	
	//public JButton [] buttonArray = new JButton[] {b1, b2, b3, b4, b5, b6};

    void TextField() //Default Constructor
    {
    	
    }
    void TextField(JTextField tf) //Parameterized Constructor
    {
    	tf = new JTextField(16);
    }
    //If the button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Calculate")) 
        {
            //Sets the text field to blank
        	tf1.setText("  ");

        }
    }
//    JPanel buttonPanel;
//    public JPanel resizeButton() 
//    {
//    	  buttonPanel = new JPanel();
//    	  buttonPanel.setLayout(null);
//    	  buttonPanel.setLocation(10, 50);
//    	  buttonPanel.setSize(1370, 770);
//
//    	  JButton Button1 = new JButton("Button 1");
//    	  Button1.setLocation(0, 0);
//    	  Button1.setSize(120, 30);
//    	  buttonPanel.add(Button1);
//
//    	  JTextField a = new JTextField(20);
//    	  a.setLocation(125, 0);
//    	  a.setSize(120, 30);
//    	  buttonPanel.add(a);
//
//    	  return buttonPanel;
//    	}
}    
     