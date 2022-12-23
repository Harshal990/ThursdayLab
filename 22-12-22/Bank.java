/*
1.Write program to show method overriding using a Bank class as
 super class and create some sub class accordingly. 
 Write at least common property (method) and change the implementation
 in subclass. Display the implementation of each subclass with object.

*/

package Thursday_lab;

public class Bank {

	
	
	public void depositMoney() {
		
		System.out.println("This Method is used for depositing the money");
	}
	
	public void withdrwalMoney() {
		
		System.out.println("This Method is used for withdrwaling the money");
	}
}