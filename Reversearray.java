/******************************************************************************
Day 1(25/09/2022)

Revers array problem using java

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the Array:");
    int len=sc.nextInt();
    int [] ar=new int[len];
    System.out.println("Enter array values:");
    for(int i=0;i<len;i++)
    {
        ar[i]=sc.nextInt();
    }
    System.out.println("Reversed Array");
    for(int i=len-1;i>=0;i--)
    {
        System.out.println(ar[i]);
    }
	}
}
