/*
4.write a program to  to calculate factorial number:
Input=5
			5*4*3*2*1=120
*/


package basicprogram;

import java.util.Scanner;					//Scanner package

public class FactorialOfNumber {
public static void main(String[] args) {
	int number,i=1,fact=1;
    System.out.println("Enter the number: ");					//input from user
    Scanner scanner = new Scanner(System.in);
    number = scanner.nextInt();
    
    
    while(i<=number)										//while loop
    {
        fact = fact * i;
        i++;
    }
    System.out.println("Factorial of "+number+" is: "+fact);
	
	
	}
}

