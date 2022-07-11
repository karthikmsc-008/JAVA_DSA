// Java basci programs

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   // Scanner is used to get the input from the user
	    Scanner sc= new Scanner(System.in); 
	   
	    String str=sc.nextLine(); //use to get the string input
	    System.out.println(str); 
	    int a= sc.nextInt(); //used to get the integer input
	   
	   // Print a pyramid pattern
	   
		for(int i=0;i<a;i++)
		{
		    for(int j=0;j<i+1;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
		for(int i=a-1;i>0;i--)
		{
		    for(int j=i;j>0;j--)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
		
	}
}
