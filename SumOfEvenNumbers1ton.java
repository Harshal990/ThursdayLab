

/*
 HOMEWORK 
 * 
 1.write a program to to calculate sum of all even numbers from 1 to n;

*/

package basicprogram;								

import java.util.Scanner;							//scanner package

public class SumOfEvenNumbers1ton {
	public static void main(String[] args) {
		int j,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		for(j=0;j<=n;j++) 							//for loop
			if(j%2==0) {
				sum=sum+j;
			}
		}
		System.out.println("The sum of even numbers from 1 to n is:"+sum);
	}
}
