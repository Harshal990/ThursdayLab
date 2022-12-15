/*
1.write a program to check if the letter 'e' is present
 in the word 'mumbai' or not.
2.wap to check if the worrd "I" is present in the
 "I love my India" or not.
3.wap to print reverse of a string.

5.wap to find out number of occurance of one alphabets.
6.wap to join two string.
7.write a program to compare two string.

//que1
package Thursday_lab;

public class EInMumbai {

	public static void main(String[] args)
	{
		String st="mumbai";
		char ch='e';
		
		if(st.contains("e"))
		{
			System.out.println("e is present in mumbai");
		}
		else
		{
		System.out.println("e is not present in mumbai");
		}
	}
}









*/


//que5
package Thursday_lab;

import java.util.Scanner;

public class EInMumbai {

	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println("1st occurence of o is at"+str.indexOf('o'));
		System.out.println("last occurence of o is at"+str.lastIndexOf('o'));

	}
}




















































