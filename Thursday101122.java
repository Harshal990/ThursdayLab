/*
1.find out all perfect number between 1 to 50.  o/p=6 28
*/
package OopsConcept;

import java.util.Scanner;
public class Thursday101122
{
        static boolean perfect(int num)
        {
            int sum = 0;
            for(int i=1; i<num; i++)
            {
                if(num%i==0)
                {
                    sum = sum+i;
                }
            }
            if(sum==num)
                return true;
            else
                return false;
        }
        public static void main(String[] args)
        {
            
            for(int i=1; i<=50; i++)
            {
                if(perfect(i))
                    System.out.println("The perfect numbers between 1-50 are :"+i);
            }
        }
 
 
}
