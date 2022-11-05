//write a program to find out first and last digit from a number.



package basicprogram;

import java.util.Scanner;						//Scanner package

public class FirstAndLastDigit {
	public static void main(String[] args) 
	{
		int n, firstdigit, lastdigit;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number: ");				//input from user
		n = sc.nextInt();	
		
		firstdigit = n;
		while(firstdigit >= 10)						//while loop
		{
			firstdigit = firstdigit / 10;
		}	
		
		lastdigit = n% 10;
		
		System.out.println("\n The First and Last Digit of the number " + n + " is:  " + firstdigit+"&"+lastdigit);
	}
}