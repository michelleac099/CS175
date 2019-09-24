import java.util.Scanner;

public class PaintCost {

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house.
		 */
		
		//Declaring most of the variables that will be used
		double houseLengthFeet;
		double houseLengthInches;
		double houseWidthFeet;
		double houseWidthInches;
		double houseHeightFeet;
		double houseHeightInches;
		double windowLengthFeet;
		double windowLengthInches;
		double windowWidthFeet;
		double windowWidthInches;
		int windowNumber;
		double doorLengthFeet;
		double doorLengthInches;
		double doorWidthFeet;
		double doorWidthInches;
		int doorNumber;
		double sqFtCost;
		double sqFtPeak;
		double sqFtNormal;
		double sqFtWindows;
		double sqFtDoors;

		/*
		 * Asking for user input on the measurements. 
		 * Foot + inch measurements are requested in order to be more user-friendly.
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the length of the house in feet: ");
		houseLengthFeet = in.nextDouble();
		
		System.out.print("Please enter the length of the house in inches: ");
		houseLengthInches = in.nextDouble();
		
		System.out.print("Please enter the width of the house in feet: ");
		houseWidthFeet = in.nextDouble();
		
		System.out.print("Please enter the width of the house in inches: ");
		houseWidthInches = in.nextDouble();
		
		System.out.print("Please enter the height of the house in feet: ");
		houseHeightFeet = in.nextDouble();
		
		System.out.print("Please enter the height of the house in inches: ");
		houseHeightInches = in.nextDouble();
		
		System.out.print("Please enter the length of the windows in feet: ");
		windowLengthFeet = in.nextDouble();
		
		System.out.print("Please enter the length of the windows in inches: ");
		windowLengthInches = in.nextDouble();
		
		System.out.print("Please enter the width of the windows in feet: ");
		windowWidthFeet = in.nextDouble();
		
		System.out.print("Please enter the width of the windows in inches: ");
		windowWidthInches = in.nextDouble();
		
		System.out.print("Please enter the number of windows: ");
		windowNumber = in.nextInt();
		
		System.out.print("Please enter the length of the doors in feet: ");
		doorLengthFeet = in.nextDouble();
		
		System.out.print("Please enter the length of the doors in inches: ");
		doorLengthInches = in.nextDouble();
		
		System.out.print("Please enter the width of the doors in feet: ");
		doorWidthFeet = in.nextDouble();
		
		System.out.print("Please enter the width of the doors in inches: ");
		doorWidthInches = in.nextDouble();
		
		System.out.print("Please enter the number of doors: ");
		doorNumber = in.nextInt();
		
		System.out.print("Please enter the paint cost per square foot: ");
		sqFtCost = in.nextDouble();
		
		//Converting the length, width and height inch measurements to feet and adding to the initial feet measurements.
		double houseLengthFinal = houseLengthFeet + (houseLengthInches/12);
		double houseWidthFinal = houseWidthFeet + (houseWidthInches/12);
		double houseHeightFinal = houseHeightFeet + (houseHeightInches/12);
		double windowWidthFinal = windowWidthFeet + (windowWidthInches/12);
		double windowLengthFinal = windowLengthFeet + (windowLengthInches/12);
		double doorWidthFinal = doorWidthFeet + (doorWidthInches/12);
		double doorLengthFinal = doorLengthFeet + (doorLengthInches/12);
		//Variables with Final in the name will be used for calculations, as they are the addition of feet + inches.
		
		//Calculations for house sides, window, and door surface areas
		sqFtNormal = houseLengthFinal * houseWidthFinal; //L*W
		sqFtPeak = (houseLengthFinal * houseWidthFinal) + ((houseLengthFinal*(houseHeightFinal - houseWidthFinal))/2); //L*W + 1/2(L*(H-W)) 
		sqFtWindows = (windowLengthFinal * windowWidthFinal) * windowNumber;
		sqFtDoors = (doorLengthFinal * doorWidthFinal) * doorNumber;
		
		//Subtracting the window and door area from the total house area
		double sqFtHouse = (sqFtNormal * 2) + (sqFtPeak * 2);
		double sqFtHouseMinusDW = sqFtHouse - (sqFtDoors + sqFtWindows);
		
		//Final cost is net house area * painter's cost
		double finalCost = sqFtHouseMinusDW * sqFtCost;
		
		//Displaying the final cost to the user
		System.out.println(" ");
		System.out.printf("The cost to paint this house is: $%.2f", finalCost); 
		//%.2f ensures that the cost will be displayed in proper dollar format
		
	} //main

} //class
