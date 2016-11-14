/*
Author: Ebube Abara
Concept 6: Endangered Animals (While Loops)
Program Description: Asks user name of animal and how many animals are left in the wild
*/

import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

class endangered
{
	public static void main (String[] param)
	{
		animals();//calls 'animals' method
		System.exit(0);//stops program
	}//END main method

	public static void animals()
	{	
		String inputQuestionnaire = "";//initialising variable
		String outputQuestionnaire = "";//initiaalising variable
		outputQuestionnaire = animalsAlgorithm(inputQuestionnaire);//calling 'animalsAlgorithm' method and passes in inputQuestionnaire' variable
		return;
	}//END OF METHOD

	public static String animalsAlgorithm(String input)
	{
		String questionA = "";
		String questionN = "";
		int questionNValue = 0;//
		String animalName = "";
		String remainingAnimals = "";
		int ans = 0;//
		List<String> animalList = new ArrayList<String>();
		List<Integer> remainingList = new ArrayList<Integer>();
		Object[] animalArray = new Object[] {};
		Integer[] remainingArray = new Integer[] {};
		int mostNumber = Integer.MAX_VALUE;
		Object mostAnimal = "";
		String output = "";
		//the above 13 lines of code have initialised variables

		while(!(questionA.equalsIgnoreCase("EXTERMINATE")))
		{
			questionA = animalQ(animalName);//ASK FOR ANIMAL NAME
			System.out.println(questionA);//testing
			if (!(questionA.equalsIgnoreCase("EXTERMINATE")))
			{
				System.out.println(questionA);//testing

				animalList.add(questionA);//ADD ANIMAL TO LIST
				System.out.println(animalList);//testing

				animalArray = animalList.toArray();//CONVERT LIST TO ARRAY
				System.out.println(animalArray[0]);//testing array works

				questionN = remainingQ(remainingAnimals);//ASK FOR REMAINING NUMBER
				System.out.println(questionN);//testing
			
				questionNValue = Integer.parseInt(questionN);//CONVERT NUMBER STRING TO INTEGER
				System.out.println(questionNValue);//testing

				remainingList.add(questionNValue);//ADD NUMBER TO LIST
				System.out.println(remainingList);//testing

				remainingArray = remainingList.toArray(new Integer[remainingList.size()]);
				System.out.println(remainingArray[0]);//testing
			}//END OF IF STATEMENT
		}//END OF WHILE LOOP

		mostNumber = remainingArray[0];
		mostAnimal = animalArray[0];
		System.out.println("mostA:" + mostNumber);//testing
		System.out.println("mostAnimalA:" + mostAnimal);//testing
		for (int i = 0; i < remainingArray.length; i++)
		{
			if (remainingArray[i] > mostNumber)
			{
				mostNumber = remainingArray[i];
				mostAnimal = animalArray[i];
			}			
		}
		System.out.println("mostB:" + mostNumber);//testing
		System.out.println("mostB:" + mostAnimal);//testing
		output = "The least endangered animal is the " + mostAnimal + "." + "\nThere are still " + mostNumber + " left in the wild.";
		System.out.println(output);//tesing
		JOptionPane.showMessageDialog(null, output);//show message box

		return output;
	}//END method 'animalsAlgorithm'

	//this method asks user for animal's name
	public static String animalQ(String input)
	{
		String question = "";//initialised variable
		question = JOptionPane.showInputDialog("Name an animal?");//show message box
		return question;
	}//END method 'animalQ'

	//this method asks user for animals left in the wild
	public static String remainingQ(String input)
	{
		String question = "";//initialised variable
		question = JOptionPane.showInputDialog("How many animals are left in the wild?");//show message box
		return question;
	}//END method 'remainingQ'
}// END OF CLASS
