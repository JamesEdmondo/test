package p1;
import java.util.Scanner;

public class Converter {
public static void main(String[] args) {
	menuChoice();	
}

public static void menuChoice() {
@SuppressWarnings("resource")
Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Please Select an Option:\n" + 
			"1.centimeters to Inches \n" + "2.Inches to Feet\n" + "3.Feet to Yards\n" + "4.Quit");
	int menuSelection = keyboard.nextInt();
	while (menuSelection != 4){
		
		if (menuSelection == 1) {
			cm2Inches();
		}
		
	if (menuSelection == 2) {
			inches2Feet();
		}

	if (menuSelection == 3) {
		feet2Yards();
	}
	else {
		System.exit(4);
	}
}
}


public static double cm2Inches() {
	Scanner keyboard = new Scanner(System.in);
	double centimeters;
	double converter = 2.54;
	System.out.println("How many centimeters do you want to convert to inches?");
	centimeters = keyboard.nextDouble();
	
	double inches1 = (centimeters/ 2.54);
	
	System.out.println("You have converted " + centimeters + " Centimenters to " + inches1 + " Inches");
	menuChoice();
	return inches1;
	
	
}

public static double inches2Feet() {
	Scanner keyboard = new Scanner(System.in);
	double inches;
	double converter = 12;
	System.out.println("How many inches do you want to convert to feet?");
	inches = keyboard.nextDouble();
	
	double feet = (inches / converter);
	
	System.out.println("You have converted " +  inches + " Inches to " + feet + " feet");
	menuChoice();
	return feet;
}

public static double feet2Yards() {
	Scanner keyboard = new Scanner(System.in);
	double feet;
	double converter = 3;
	
	System.out.println("How many feet do you want to convert to Yards?");
	feet = keyboard.nextDouble();
	
	double yards = (feet/ converter);
	
	System.out.println("You have converted " + feet + " feet to " + yards + " yards");
	menuChoice();
	return yards;
}


	
}






