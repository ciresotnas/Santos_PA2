package santos_p1;

import java.util.Scanner;

public class santos_p1 {
	public static void main(String[] args) { 
	   Scanner scnr = new Scanner(System.in);
       int givenInt;
	   int temp;
	   int num1;
	   int num2;
	   int num3;
	   int num4;
	   
	   System.out.println("Enter number to be encrypted: ");
	   givenInt = scnr.nextInt();
	   
	   num1 = givenInt/1000;
       num2 = givenInt/100 - (num1 * 10);  
	   num3 = givenInt/10 - ((num2 * 10) + (num1 * 100));
	   num4 = givenInt - ((num3 * 10) + (num2 * 100) + (num1 * 1000));
	   
	   num1 = ((num1 + 7)%10);
	   num2 = ((num2 + 7)%10);
	   num3 = ((num3 + 7)%10);
	   num4 = ((num4 + 7)%10);
	   
	   temp = num3;
	   num3 = num1;
	   num1 = temp;
	   
	   System.out.println("" + num1 + num2 + num3 + num4);
	   
	   scnr.close();
	   }

	}

