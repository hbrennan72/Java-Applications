/**********************************************************
* Hugh Brennan    |
* CITP 190		  |
* Project 13	  |
* April 27, 2012  |
* *********************************************************
* This is the applet for the StudentScoresApp.  It can be 
* used in a web page. 
**********************************************************/

import java.awt.*;
import javax.swing.*;


public class StudentScoresApplet extends JApplet
{
	public void init()
	{
		JPanel panel = new StudentScoresPanel();
		this.add(panel);
	}
}
