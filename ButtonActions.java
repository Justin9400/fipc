package fipc;

import java.awt.event.ActionEvent;

public class ButtonActions extends GUI
{
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
}
