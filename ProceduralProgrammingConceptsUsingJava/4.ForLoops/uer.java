/*
Author: Ebube Abara
Concept 4: Usability Experimental Results (For Loops)
Program Description: This program counts the number of error each participant makes on 2 alternative designs
*/

import javax.swing.*; // imports the swing library for I/O

class uer
{
	public static void main (String[] param)
	{
		usability_experiment_results();//method counts participant mistakes for interface 1 and 2 and recommends the easier interface
		System.exit(0);	//error message that lets you know your program is fine
	}

	//method counts participant mistakes for interface 1 and 2 and recommends the easier interface
	public static void usability_experiment_results()
	{		
		String textInput1 = "";
		String textInput2 = "";
		int inputValue1 = 0;
		int inputValue2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		//the six lines above are the default values set to the variables
				
		//loop asks for number of mistakes by participants in interface 1 until i counter reaches 5		
		for (int i=1; i<=5; i++)
		{
			textInput1 = JOptionPane.showInputDialog("How many mistakes did participant " + i + " make on interface 1?");// inputbox with 'constant string' and 'value of i' for interface 1
			System.out.println(textInput1);//testing
			inputValue1 = Integer.parseInt(textInput1);// converts string to integer
			sum1 = sum1 + inputValue1;// counter get input value and adds it to the previously recorded input value
			System.out.println(sum1);//testing
		}
		
		//loop asks for number of mistakes by participants in interface 2 until i counter reaches 5
		for (int i=1; i<=5; i++)
		{
			textInput2 = JOptionPane.showInputDialog("How many mistakes did participant " + i + " make on interface 2?");// inputbox with 'constant string' and 'value of i' for interface 2
			System.out.println(textInput2);//testing
			inputValue2 = Integer.parseInt(textInput2);// converts string to integer
			sum2 = sum2 + inputValue2;// counter get input value and adds it to the previously recorded input value
			System.out.println(sum2);//testing
		}

		JOptionPane.showMessageDialog(null, sum1 + " mistakes were made with interface 1");// outputs sum of interface 1 and concats it to constant string
		JOptionPane.showMessageDialog(null, sum2 + " mistakes were made with interface 2");// outputs sum of interface 2 and concats it to constant string

		//if statement showing which interface is easier based on their total number of participant mistakes 		
		if (sum1<sum2) {
			JOptionPane.showMessageDialog(null, "Interface 1 seems to be easier to use than Interface 2");
		}
		else if (sum1>sum2){
			JOptionPane.showMessageDialog(null, "Interface 2 seems to be easier to use than Interface 1");
		}
		else {
			JOptionPane.showMessageDialog(null, "Both Interface 1 and Interface 2 have the same level of participant mistakes");		
		}
				
	}// END METHOD: usability_experiment_results
}// END class: uer
