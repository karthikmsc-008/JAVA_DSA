/******************************************************************************
Day 1 (25/09/2022)
Find max and min element in the array
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
    Arrays.sort(ar);
    System.out.println("Maximum = "+ar[len-1]+", Minimum = "+ar[0]);
	}
}
