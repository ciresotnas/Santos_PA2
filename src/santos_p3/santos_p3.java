package santos_p3;

import java.util.Scanner;

public class santos_p3 {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   String[] pollTopics = new String[5];
	   int[][] pollResponse = new int[5][11];
	   int[] totalRate = new int[5];
	   int[] rateAvg = new int[5];
	   int responseBeta;
	   int maxRate = 0;
	   int maxTopic = 0;
	   int lowRate = 0;
	   int lowTopic = 0;
	   int n;
	   int j;
	   int i;
	   int k;
	   int m;
	   int o;
	   
	   pollTopics[0] = ("Nintendo Games");
	   pollTopics[1] = ("Italian Food");
	   pollTopics[2] = ("Lime Bikes");
	   pollTopics[3] = ("AI Apocalypse");
	   pollTopics[4] = ("Pepe Memes");
	   
	   System.out.println("How many people will be responding to this poll?");
	   n = scnr.nextInt();							   
	   System.out.println("On a scale of 1-10, rate the following topics in accordance with their importance to you.");
	   
	   for(i = 0; i < n; i++) {
		   System.out.println("New person begin polling.");
		   for(j = 0; j < 5; j++) {
			   System.out.println(pollTopics[j]);
			   responseBeta = scnr.nextInt();
			   pollResponse[j][responseBeta -1]++;
		   }
	   }
	   System.out.println("               1 2 3 4 5 6 7 8 9 10 | Average");
	   System.out.println("----------------------------------------------");
	   for(k = 0; k < 5; k++) {
		   System.out.print(pollTopics[k]);
		   if((pollTopics[k].length()) < 14) {
			   for(m = 0; m < (14 - (pollTopics[k].length())); m++)
				   System.out.print(" ");
		   }
		   for(o = 0; o < 10; o++) {
			  System.out.print(" " + pollResponse[k][o]);
			  totalRate[k] += ((o+1) * pollResponse[k][o]);
		   }
		   System.out.print("     ");
		   rateAvg[k] = (totalRate[k]/n);
		   System.out.println(rateAvg[k]);
		   if(totalRate[k] > maxRate) {
			   maxRate = totalRate[k];
			   maxTopic = k;
			   if(k == 0) 
				   lowRate = totalRate[k];
		   }
		   if(totalRate[k] < lowRate) {
			   lowRate = totalRate[k];
			   lowTopic = k;  
		   }
	   }
	   System.out.println();
	   System.out.println("The issue with the highest rating overall was " + pollTopics[maxTopic] + " with a total rating of " + maxRate + ".");
	   System.out.println("The issue with the lowest rating overall was " + pollTopics[lowTopic] + " with a total rating of " + lowRate + ".");
	   
	   scnr.close();
   }
}
