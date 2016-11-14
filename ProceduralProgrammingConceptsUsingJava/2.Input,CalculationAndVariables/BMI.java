/*
Author: Ebube Abara
Concept 2: Body Mass Index (Input, Calculations and Variables)
Program Description: Program allows person to type in their weight in kg and heaght in cm and prints out their bmi
*/


import javax.swing.*; // import the swing library for I/O

class BMI
{
	public static void main (String[] param)
	{
	algorithmBMI();// this method asks user for wieght and height to calculate their BMI       
	System.exit(0);//error message that lets you know your program is fine

	} // END main
	
	public static void algorithmBMI()
	{
		String weight = JOptionPane.showInputDialog("Please type in your weight (in Kg)"); //inputbox is shown to allow user enter characters
		String height = JOptionPane.showInputDialog("Please type in your height (in cm)"); //inputbox is shown to allow user enter characters
		
		int heightI = Integer.parseInt(height);// this converts a the height character to an Integer
		int weightI = Integer.parseInt(weight);// this converts a the weight character to an Integer

		System.out.println(heightI);
		System.out.println(weightI);

		int heightCalc1 = (heightI * heightI) / 10000;

		System.out.println(heightCalc1);

		int calculatedBMI = (weightI / heightCalc1);

		JOptionPane.showMessageDialog(null, "You have a Body Mass Index of " + calculatedBMI);//this output the users BMI on a messagebox
	} // END algorithmBMI method

} // END class BMI
