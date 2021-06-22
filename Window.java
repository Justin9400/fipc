package fipc;
import javax.swing.*;
import java.awt.*;
class Window
{
	public int height, width;
	
	
	public Window(Dimension size, JFrame frame)
	{
		height = getScreenHeight(frame, size); //Sets the window height
    	width = getScreenWidth(size); //Sets the window width
    	setWindowSize(frame, height, width); //Sets the window size
    	backgroundColor(frame); //Sets the background color
    	closeWindow(frame); //Stops the window from running in the background
	}
    public int getScreenWidth(Dimension size)
    {   
    	int width = (int)size.getWidth(); //Stores the screen width        	    	
    	return width;
    }
    public int getScreenHeight(JFrame frame, Dimension size)
    {
        int height = (int)size.getHeight(); //Stores the screen height

    	return height;
    }
    public void setWindowSize(JFrame frame, int height, int width)
    {
    	frame.setSize(width, height); //Sets the size of the window 

    }
    public void backgroundColor(JFrame frame)
    {
    	frame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
    public void closeWindow(JFrame frame)
    {
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
