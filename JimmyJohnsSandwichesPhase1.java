/**
 * Course:   IT110 - Introduction to Programming
 * Filename: PizzasRUsPhase1.java
 * Professor: Dr. Bary W Pollack
 * 
 * Purpose:  Created a simple online ordering system
 *			 for Pizzas-R-Us customers
 */

import javax.swing.JOptionPane;

/**
 * @author Nicholas Weinold
 */
public class JimmyJohnsSandwichesPhase1 {

	



	/**
	 * @param args
	 */
	public static String getStringInput(String prompt) //Phase2 additional content ends @ public static void main(String[] args)
	{
		String inputValue;
		int counter = 0;
				
		do
		{
			counter = counter + 1;
			inputValue = JOptionPane.showInputDialog(prompt);
			
			if (counter>3)
			{
				JOptionPane.showMessageDialog(null, "If you are not sure about your order you can always call us!"); // error message
				System.exit(100);
			}
			
			if (inputValue == null)
			{
				JOptionPane.showMessageDialog(null, "oops! you closed your order. \n Please come back soon!"); //goodbye message
				System.exit(0);
			}
			
			if (inputValue.equals("0"))
			{
				JOptionPane.showMessageDialog(null, "You have selected no Sandwich"); //0 input message
			}
			
			if (inputValue.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Sorry, You cannot leave this space empty"); // Input reminder message
			}
		} while (inputValue.equals("") && (counter<=3));
		
		return inputValue;
	}
	
	public static double totalCost(int number, double cost, double salesTaxRate)
	{
		double totalCost = 0;
		cost = 6.00;
		salesTaxRate = 0.05;
		
		
	
		return totalCost;
		}
	

	
	
	public static void main(String[] args) 
	{

		// declare variables
		
		String openingMsg;
		
		String nameInputMsg;
		String customerName;
		String nameOutputMsg;
		
		String returnInputMsg;
		String customerReturn;
		String returnOutputMsg;
		
		String orderInputMsg;
		String customerOrder;
		String orderOutputMsg;
		
		String orderQuantityMsg;
		String orderQuantity;

		
	
		
		String hamCheese  = "Ham and Cheese"; // Added this just to practice with code. Phase2 addition
		String roastBeef  = "Roast Beef";		
		String tunaSalad  = "Tuna Salad";
		String turkBreast = "Turkey Breast";
		String veggie	  = "Veggie";
		
		String side1InputMsg;
		String customerSide1;
		String side1OutputMsg;
		
		String side2InputMsg;
		String customerSide2;
		String side2OutputMsg;
		
		String totalCostOutputMsg;
		String outputMsg;
		String salesTaxOutputMsg;
		String subTotalOutputMsg;
		
		
		String greetingOutputMsg;
		
		

		// display opening message
		openingMsg = " Welcome to Jimmy John's Gourmet Sandwiches Online Ordering System \n"
				   + "                     It's a great day to order a Sandwich!";
		JOptionPane.showMessageDialog(null, openingMsg);

		// get required input using dialogs
		nameInputMsg   = "Please tell us your name: ";
		customerName   = getStringInput(nameInputMsg);
		
		returnInputMsg = "Have you ordered with us before (yes or no)? ";
		customerReturn = getStringInput(returnInputMsg);
		
		orderInputMsg  = "Please select a Sandwich: \n"
					   +  hamCheese + "\n" 
					   +  roastBeef + "\n"
					   +  tunaSalad + "\n"
					   +  turkBreast + "\n"
					   +  veggie + "\n";
		customerOrder  = getStringInput(orderInputMsg);							//Phase2 additional
		
		//get the quantity value
		orderQuantityMsg = "How many would you like? (1-10)";					//Phase2 additional
		orderQuantity = getStringInput(orderQuantityMsg);						//Phase2 additional
		
		double totalCost = 0;											//I felt some of this belongs in the method totalCost but
		double cost = 6.00;												// I could not figure out how to call the method in the main.
		double salesTaxRate = 0.05;										// I kept working myself back to building the equation in the main
		Integer orderQuantityI = 0;										//
		orderQuantityI = Integer.parseInt(orderQuantity);				//
		
		totalCost(orderQuantityI, cost, salesTaxRate);					//
		
		
		double myTotalCost;												// I know that for the output this would be used to call the total
		myTotalCost = totalCost;										// of the order but i was unable to use it due to my totalCost method
																		// not working. I apologize.	
		double subTotal = orderQuantityI * cost;
		double salesTax = (subTotal * salesTaxRate);
		double salesTaxR = Math.round(salesTax * 100.0)/ 100.0;			// used Math.round to rid program of annoying millionth place decimals. hope this is OK.
		
	
		side1InputMsg   = "Would you like a complimentary cookie? (yes or no)";
		customerSide1   = getStringInput(side1InputMsg);
	
		
		side2InputMsg   = "Would you like a complimentary pickle? (yes or no)";
		customerSide2   = getStringInput(side2InputMsg);
		
		
	
		// build output strings
		nameOutputMsg     = "Welcome " + customerName + ".\n\n";
		returnOutputMsg   = "Returning customer status: " + customerReturn + "\n\n";
		orderOutputMsg    = "You have ordered a " + customerOrder + " sandwich x " + orderQuantityI + " \n";
		side1OutputMsg     = "w/ Cookie: " + customerSide1 + "\n";
		side2OutputMsg     = "w/ pickle: " + customerSide2 + "\n\n\n";
		
		subTotalOutputMsg = "Your sub total is $" + subTotal + "\n";		//Wanted to include subtotal and sales tax to order printout.
		salesTaxOutputMsg = "Your sales tax is $" + salesTaxR + "\n";
		totalCostOutputMsg = "Your total is $" + (subTotal + salesTaxR) + "\n\n";		   
		greetingOutputMsg = "Thank you for visiting Jimmy John's Gourmet Sandwiches!" + "\n\n"
						  + "Your order should be ready in less than 5 minutes.\n";

		// create and display output string
		outputMsg = nameOutputMsg + returnOutputMsg + orderOutputMsg + side1OutputMsg + side2OutputMsg + subTotalOutputMsg + salesTaxOutputMsg + totalCostOutputMsg + greetingOutputMsg;
		JOptionPane.showMessageDialog(null, outputMsg);

		System.exit(0);
	} // end main()

	

} // end class JimmyJohnsSandwichesPhase1
