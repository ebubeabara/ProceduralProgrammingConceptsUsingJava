/*
Author: Ebube Abara
Concept 3: Underground zones (Making Decisions)
Program Description: This program tells people underground zones 5 particular stations are in
*/
import javax.swing.*; // import the swing library for I/O


class undergroundzones
{
	public static void main (String[] param)
	{
		londonUndergroundZones();//this method is what asks and response to users input
		System.exit(0);//error message that lets you know your program is fine
	}

	public static void londonUndergroundZones()
	{				
		String zones = JOptionPane.showInputDialog("Enter a station here to find its zone");//this created a inputbox where the user can type in. It also contains a helper text telling you what you are expected to input Eg: "Enter a station here to find its zone"//


		if (zones.equals("Victoria")) {
			JOptionPane.showMessageDialog(null, "Victoria is in zone 1.");//this outputs a response on messagebox
			return;		
		}
		// if user enters "Victoria" then respond with "Victoria is in zone 1"//
		else if (zones.equals("Mile End")) {
			JOptionPane.showMessageDialog(null, "Mile End is in zone 2.");//this outputs a response on messagebox
			return;		
		}
		// if user enters "Mile End" then respond with "Mile End is in zone 2"//
		else if (zones.equals("Stratford")) {
			JOptionPane.showMessageDialog(null, "Stratford is in zone 3.");//this outputs a response on messagebox
			return;		
		}
		// if user enters "Stratford" then respond with "Stratford is in zone 3"//
		else if (zones.equals("Greenford")) {
			JOptionPane.showMessageDialog(null, "Greenford is in zone 4.");//this outputs a response on messagebox
			return;		
		}
		// if user enters "Greenford" then respond with "Greenford is in zone 4"//
		else if (zones.equals("Edgware")) {
			JOptionPane.showMessageDialog(null, "Edgware is in zone 5.");//this outputs a response on messagebox
			return;		
		}
		// if user enters "Edgware" then respond with "Edgware is in zone 5"//
		else {
			JOptionPane.showMessageDialog(null, "Please try again.");//this outputs a response on messagebox
			return;	
		}
		// if user does not enter either Victoria, Mile End, Stratford, Greenford or Edgware the respond with "Please try again"//

	}// END londonUndergroundZones method
} // END class undergroundzones

