package main;
import javax.swing.*;
import java.awt.*;
class GUI{
	
    public static int getScreenWidth(JFrame frame, Dimension size)
    {    
    	int width = (int)size.getWidth(); //Stores the screen width
            	    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//JButton button = new JButton("Click me");
    	//frame.getContentPane().add(button); // Adds Button to content pane of frame
    	//System.out.print(resolution);
    	return width;
    }
    public static int getScreenHeight(JFrame frame, Dimension size)
    {
        int height = (int)size.getHeight(); //Stores the screen height

    	return height;
    }
    public static void setWindowSize(JFrame frame, int height, int width)
    {
    	frame.setSize(width, height); //Sets the size of the window 

    }
    public static void backgroundColor(JFrame frame)
    {
    	frame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
}
