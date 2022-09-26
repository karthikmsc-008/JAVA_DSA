/******************************************************************************
Day 1 (25/09/2022)

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
    System.out.println("Enter the K ");
    int k=sc.nextInt();
    System.out.println(Arrays.toString(ar));
    System.out.println("Maximum = "+ar[len-k-1]+", Minimum = "+ar[k-1]);
	}
}
