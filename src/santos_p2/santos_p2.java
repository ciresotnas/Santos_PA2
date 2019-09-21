package santos_p2;

import java.util.Scanner;

public class santos_p2 {
   public static void main(String[] args) {
	  Scanner scnr = new Scanner(System.in);
	  int userWeight;
	  int userHeight;
	  int choiceBMI;
	  double userBMI;
	  
	  System.out.println("Enter your weight in pounds or kilograms: ");
	  userWeight = scnr.nextInt();
	  System.out.println("Enter your height in inches or meters: ");
	  userHeight = scnr.nextInt();
	  
	  System.out.println("Enter 1 for the BMI formula for pounds and inches, or 2 for kilograms and meters: ");
	  choiceBMI = scnr.nextInt();
	  
	  if(choiceBMI == 1) {
	      userBMI = (double)((703 * userWeight)/(Math.pow(userHeight, 2)));
	 }
	  else
		  userBMI = (double)((userWeight)/(Math.pow(userHeight, 2)));
	  
	  System.out.println("User's BMI is " + userBMI);
	  System.out.println();
	  System.out.println("Underweight = <18.5");
	  System.out.println("Normal Weight = 18.5-24.9");
	  System.out.println("Overweight = 25-29.9");
	  System.out.println("Obesity = >30");
	  
	  scnr.close();
   }
}
