/*
Author: Ebube Abara
Concept 8: Garden Watch (Methods with Arrays)
Program Description: The program is for conscientious birdwatcher who wishes to record the birds of different kinds in his garden at the same time, each day.
*/

import javax.swing.*;

class garden
{
	public static void main (String[] param)
	{
		String birdQuestion = "";//initialising variable
		String clearResultsQuestion = "";//initilaising variable
		String[] clearResults = new String[] {};//initialising array variable
		String collectResults = "";//initialising variable
		String resetOutputResults = "";//initialising variable

		int[] birdNumberArray = {1, 2, 3, 4, 5};//array containing number representing bird
		String[] birdNameArray = {"Blue Tit", "Blackbird", "Robin", "Wren", "Greenfinch"};//array containing birds name
		String[] birdSeenArray = {"No", "No", "No", "No", "No"};//array containing if birds have been seen or not

		//if 100 is entered, program recording birds seen is stopped else program continues
		while (!(birdQuestion.equalsIgnoreCase("100")))
		{
			birdQuestion = JOptionPane.showInputDialog("What bird are you reporting? \n1) Blue Tit 2) Blackbird 3) Robin 4) Wren 5) Greenfinch \nPlease enter 1,2,3,4,5 or 100 to QUIT:");//asking birdwatcher a question

			if (birdQuestion.equalsIgnoreCase("1"))
			{
				birdSeenArray[0] = "Yes";//if bird number 1 is selected, array reference 0 is updated
			}
			else if (birdQuestion.equalsIgnoreCase("2"))
			{
				birdSeenArray[1] = "Yes";//if bird number 2 is selected, array reference 1 is updated
			}
			else if (birdQuestion.equalsIgnoreCase("3"))
			{
				birdSeenArray[2] = "Yes";//if bird number 3 is selected, array reference 2 is updated
			}
			else if (birdQuestion.equalsIgnoreCase("4"))
			{
				birdSeenArray[3] = "Yes";//if bird number 4 is selected, array reference 3 is updated
			}
			else if (birdQuestion.equalsIgnoreCase("5"))
			{
				birdSeenArray[4] = "Yes";//if bird number 5 is selected, array reference 4 is updated
			}
			else if (!(birdQuestion.equalsIgnoreCase("100")))
			{
				JOptionPane.showMessageDialog(null, "Error - Select either 1) Blue Tit 2) Blackbird 3) Robin 4) Wren 5) Greenfinch \nPlease enter 1,2,3,4,5 or 100 to QUIT:");
			}
		}

		collectResults(birdNumberArray, birdNameArray, birdSeenArray);//method collects results

		printResults(birdNumberArray, birdNameArray, birdSeenArray);//method prints results

		clearResultsQuestion = JOptionPane.showInputDialog("Do you want to clear stored result? (yes / no). \nEntering 'Yes' resets all  birds seen in garden result to 'No'");//asks birdwatcher question

		if (clearResultsQuestion.equalsIgnoreCase("Yes"))
		{
			clearResults = birdFalse(birdSeenArray);//calling 'birdFalse' method and passing in 'birdSeenArray' array
			JOptionPane.showMessageDialog(null, "All stored results for 'birds seen in garden' have been reset to 'No'. \nGoodbye!");//informs birdwatcher all previously stored birds seen results have been reset to 'No'
			resetOutputResults = "Reset Garden Watch results are:" + "\n" + birdNumberArray[0] + ") " + birdNameArray[0] + "   " + birdSeenArray[0] + "\n" + birdNumberArray[1] + ") " + birdNameArray[1] + "   " + birdSeenArray[1] + "\n" + birdNumberArray[2] + ") " + birdNameArray[2] + "   " + birdSeenArray[2] + "\n" + birdNumberArray[3] + ") " + birdNameArray[3] + "   " + birdSeenArray[3] + "\n" + birdNumberArray[4] + ") " + birdNameArray[4] + "   " + birdSeenArray[4];
			System.out.println(resetOutputResults);//testing
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Goodbye!");//shows goodbye message to birdwatcher
		}

		System.exit(0);//stops program
	}//END main method


	//THIS METHOD CLEARS BIRDSEENARRAY TO ALL FALSE
	public static String[] birdFalse(String inputBirdSeen[])
	{
		for (int i = 0; i < inputBirdSeen.length; i++)
		{
			inputBirdSeen[i] = "No";//replacing value in array reference i to 'No'
			System.out.println("Bird Seen Array Reference " + i + " - " +  inputBirdSeen[i]);//testing
		}
		return inputBirdSeen;
	}//END method 'birdFalse'


	//THIS METHOD COLLECTS RESULTS
	public static String collectResults(int[] inputNumber, String[] inputName, String[] inputSeen)
	{
		String output = "";//initialising variable
		int[] birdNumber = inputNumber;//initialising array variable
		String[] birdName = inputName;//initialising array variable
		String[] birdSeen = inputSeen;//initialising array variable

		output = "Your collected Garden Watch results are:" + "\n" + birdNumber[0] + ") " + birdName[0] + "   " + birdSeen[0] + "\n" + birdNumber[1] + ") " + birdName[1] + "   " + birdSeen[1] + "\n" + birdNumber[2] + ") " + birdName[2] + "   " + birdSeen[2] + "\n" + birdNumber[3] + ") " + birdName[3] + "   " + birdSeen[3] + "\n" + birdNumber[4] + ") " + birdName[4] + "   " + birdSeen[4];

		System.out.println(output);//testing
		return output;
	}//END method 'collectResults'


	//THIS METHOD PRINTS RESULTS
	public static void printResults(int[] inputNumber, String[] inputName, String[] inputSeen)
	{
		String output = "";//initialising variable
		int[] birdNumber = inputNumber;//initialising array variable
		String[] birdName = inputName;//initialising array variable
		String[] birdSeen = inputSeen;//initialising array variable

		output = "Your Garden Watch results are:" + "\n" + birdNumber[0] + ") " + birdName[0] + " - " + birdSeen[0] + "\n" + birdNumber[1] + ") " + birdName[1] + " - " + birdSeen[1] + "\n" + birdNumber[2] + ") " + birdName[2] + " - " + birdSeen[2] + "\n" + birdNumber[3] + ") " + birdName[3] + " - " + birdSeen[3] + "\n" + birdNumber[4] + ") " + birdName[4] + " - " + birdSeen[4];

		System.out.println(output);//testing
		JOptionPane.showMessageDialog(null, output);//shows message box of result to birdwatcher
	}//END method 'printResults'
}//END class 'garden'
