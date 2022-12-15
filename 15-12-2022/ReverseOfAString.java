package Thursday_lab;

import java.util.Scanner;

public class ReverseOfAString {

	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String revstr="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			revstr=ch + revstr;
		}
		System.out.println("Reverse of "+str+" is "+revstr);	
	}
}