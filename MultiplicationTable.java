/*2.write a program to print multiplication table:
i/p=5
5*1=5
5*2=10
*/


package basicprogram;

import java.util.Scanner;							//Scanner package

public class MultiplicationTable {
	public static void main(String[] args) {
		
		int i,n;									//Variables
				
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			n=sc.nextInt();
			
			for(i=1;i<=10;i++) {					//for loop
				System.out.println(n+"*"+i+"="+n*i);
			}
			
		
	
	}
}
