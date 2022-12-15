//4.write a program to find  first and the last occurence of the
//letter 'o'  in a string.

package Thursday_lab;

import java.util.Scanner;

public class OccurenceOfO {

	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println("1st occurence of o is at"+str.indexOf('o'));
		System.out.println("last occurence of o is at"+str.lastIndexOf('o'));
	}
}
