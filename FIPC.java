package main;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

class FIPC
{ 
    public static void main(String []args)
    {
    	Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); //Gets the screen resolution
    	JFrame frame = new JFrame("Financial Investment Profit Calculator"); //Title of the window
    	GUI gui = new GUI();
    	
    	int height = gui.getScreenHeight(frame, size);
    	int width = gui.getScreenWidth(frame, size);
    	gui.setWindowSize(frame, height, width);
    	gui.backgroundColor(frame);
    	frame.setVisible(true);
        //Scanner sc = new Scanner(System.in);
        
        
    }
}

