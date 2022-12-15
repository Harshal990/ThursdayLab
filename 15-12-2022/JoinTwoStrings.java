package Thursday_lab;

import java.util.Scanner;

public class JoinTwoStrings {

	public static void main(String[] args)
	{
		//User input for string1
		System.out.println("Enter first string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
		//User input for string2
		System.out.println("Enter second string");
		String str2=sc.nextLine();
		
		//joining two strings
		String str3=str1.concat(" "+str2);
		
		System.out.println(str3+" is the result of concatenation of string 1 and string2");
		
	}
}
