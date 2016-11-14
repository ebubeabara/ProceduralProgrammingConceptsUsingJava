/*
Author: Ebube Abara
Concept 7: Car Sales (Methods)
Program Description: Helps a sales person selling eco cars to work out the price to charge customers
*/

import javax.swing.*;
import java.util.Scanner;

class cars
{
	public static void main (String[] param)
	{
		String modeltype = "";//initialised variable
		String solarpanel = "";//initiaised variable
		int discount = 0;//initialised variable
		int total = 0;//initilaised variable
		String keepselling = "yes";//initialised variable

		int basicValue = 20000;//initialised variable
		int modeltypeValue = 0;//initialised variable
		int solarpanelValue = 0;//initialised variable

		intro();//shows employee intro message

		while (keepselling.equalsIgnoreCase("yes"))
		{
			modeltype = model();//calls 'model' method
			System.out.println(modeltype);//testing

			//if statement prevents employee from continuing if wrong value is entered
			if (!((modeltype.equalsIgnoreCase("hybrid"))||(modeltype.equalsIgnoreCase("electric"))))
			{
				JOptionPane.showMessageDialog(null, "Error - Wrong model type entered. Enter only 'Hybrid' or Electric'");				
				break;
			}

			if (modeltype.equalsIgnoreCase("hybrid"))
			{
				modeltypeValue = 1500;
			}
			else if (modeltype.equalsIgnoreCase("electric"))
			{
				modeltypeValue = 2000;
			}

			solarpanel = roof();//calls 'roof' method
			System.out.println(solarpanel);//testing

			//if statement prevents employee from continuing if wrong value is entered
			if (!((solarpanel.equalsIgnoreCase("yes"))||(solarpanel.equalsIgnoreCase("no"))))
			{
				JOptionPane.showMessageDialog(null, "Error - Wrong solar panel details entered. Enter only 'Yes' or No'");				
				break;
			}

			if (solarpanel.equalsIgnoreCase("yes"))
			{
				solarpanelValue = 5000;
			}
			else if (solarpanel.equalsIgnoreCase("no"))
			{
				solarpanelValue = 0;
			}

			discount = discountapplied(modeltype, solarpanel);//calls 'discountapplied' method and passes in 2 parmeters
			System.out.println(discount);//testing

			total = totalAlgorithm(modeltype, solarpanel, discount);//calls 'totalAlgorithm' method and passes in 3 parameters 
			System.out.println(total);//testing

			printPrice(basicValue, modeltype, modeltypeValue, solarpanel, solarpanelValue, discount, total);

			keepselling = JOptionPane.showInputDialog("Do you want to keep selling? (Yes / No)");
		}

		System.exit(0);//stops program
	}//END main method


	//METHOD ASKS FOR CAR MODEL TYPE
	public static String model()
	{
		String question = "";//initialising variable
		String output = "";//initialising variable
		question = JOptionPane.showInputDialog("What model type does customer want? (Hybrid / Electric)");//asking question
		output = upperCaseFL(question);//passes value entered to upperCaseFL method to capitalise first letter
		return output;
	}//END method 'model'


	//METHOD ASKS FOR ROOF TYPE
	public static String roof()
	{
		String question = "";//initialising variable
		String output = "";//initilaising variable
		question = JOptionPane.showInputDialog("Does customer want a solar panel roof? (Yes / No)");//asking question
		output = upperCaseFL(question);//passes value entered to upperCaseFL method to capitalise first letter
		return output;
	}//END method 'roof'


	//METHOD CHECKS IF CUSTOMER IS ELIGIBLE FOR DISCOUNT
	public static int discountapplied(String inputmodeltype, String inputrooftype)
	{
		String modeltype = "";//initialised variable
		String solarroof = "";//initilaised variable
		int discount = 0;//initialised variable

		modeltype = inputmodeltype;
		solarroof = inputrooftype;

		if ((modeltype.equalsIgnoreCase("hybrid"))&&(solarroof.equalsIgnoreCase("yes")))
		{
			discount = 500;//applying £500 discount
			System.out.println("Hybrid discount: " + discount);//testing
		}
		else if ((modeltype.equalsIgnoreCase("electric"))&&(solarroof.equalsIgnoreCase("yes")))
		{
			discount = 500;//applying £500 discount
			System.out.println("Electric discount: " + discount);//testing
		}
		else
		{
			discount = 0;//applying no or £0 discount
			System.out.println("No discount: " + discount);//testing
		}
		return discount;
	}//END method 'discountapplied'


	//METHOD CALCULATES THE TOTAL COST FOR THE CAR
	public static int totalAlgorithm(String inputmodeltype, String inputrooftype, int inputdiscount)
	{
		String modeltype = "";//initilaising variable
		String solarroof = "";//initialising variable
		int discount = 0;//initialising variable

		modeltype = inputmodeltype;
		System.out.println("input Model Type: " + modeltype);//testing

		solarroof = inputrooftype;
		System.out.println("input Include Solar Panel" + solarroof);//testing

		discount = inputdiscount;
		System.out.println("input Discount" + discount);//testing

		int basicPrice = 20000;//initilaising variable
		int modelPrice = 0;//initilaising variable
		int solarPrice = 0;//initilaising variable
		int total = 0;//initilaising variable

		if (modeltype.equalsIgnoreCase("hybrid"))
		{
			modelPrice = 1500;
			System.out.println("Hybrid model: " + modelPrice);//testing
		}
		else if (modeltype.equalsIgnoreCase("electric"))
		{
			modelPrice = 2000;
			System.out.println("Electric model: " + modelPrice);//testing
		}

		if (solarroof.equalsIgnoreCase("yes"))
		{
			solarPrice = 5000;
			System.out.println("Solar Panel: " + solarPrice);//testing

			discount = 500;
			System.out.println("Discount: " + discount);//testing
		}
		else if (solarroof.equalsIgnoreCase("no"))
		{
			solarPrice = 0;
			System.out.println("Solar Panel: " + solarPrice);//testing

			discount = 0;
			System.out.println("Discount: " + discount);//testing
		}

		total = (basicPrice - discount) + solarPrice + modelPrice;//using basic price, discount, model and solar panel to calculate total
		System.out.println("Total: " + total);//testing
		
		return total;
	}//END method 'totalAlgorithm'


	//METHOD PRINTS OUT OPTIONS CHOSEN WITH PRICE
	public static void printPrice(int basicValueInput, String modeltypeInput, int modeltypeValueInput, String solarpanelInput, int solarpanelValueInput, int discountInput, int totalInput)
	{
		JOptionPane.showMessageDialog(null, "Basic Price: " + basicValueInput + "\n" + modeltypeInput + ": " + modeltypeValueInput + "\n" + "Solar Panel - " + solarpanelInput + ": " + solarpanelValueInput + "\n" + "Discount: " + discountInput + "\n\n" + "Total: £" + totalInput);
	}//END method 'printPrice'


	//INTRODUCTION MESSAGE FOR EMPLOYEE WHEN THEY OPEN APP
	public static void intro()
	{
		JOptionPane.showMessageDialog(null, "Welcome! This app will help you eco cars easier. Lets begin");
		return;
	}//END method 'intro'


	//THIS METHOD CHANGES THE FIRST LETTER OF A WORD TO UPPERCASE
	public static String upperCaseFL(String inputValue)
	{
		char[] arrayFirstLetter = inputValue.toCharArray();//converts inputValue string to new character array
		System.out.println(arrayFirstLetter[0]);//testing
		arrayFirstLetter[0] = Character.toUpperCase(arrayFirstLetter[0]);//converts first character to uppercase
		System.out.println(arrayFirstLetter[0]);//testing
		return new String (arrayFirstLetter);
	}//END of 'upperCaseFL' method
}








