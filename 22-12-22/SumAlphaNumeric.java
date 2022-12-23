package Thursday_lab;
import java.util.Scanner;
public class SumAlphaNumeric {
	public static void main(String[] args)
	{
		int sum=0;
		String alphanum;		//Variable declaration
		System.out.println("Enter a Alphanumeric string");		//User input
		Scanner sc=new Scanner(System.in);
		alphanum=sc.nextLine();
		
	//Finding numbers in a string
		for(int i=0;i<alphanum.length();i++)
		{
			//
			if(alphanum.charAt(i)>='0'  &&  alphanum.charAt(i)<='9')
			{
				//Adding numbers
				sum=sum+(alphanum.charAt(i)-'0');
			}
		}
		
		//Output
		System.out.println("The sum of numbers present in the given alphanumeric string is :"+sum);		
	}

}
