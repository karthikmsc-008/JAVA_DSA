/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void InsertionSort(int [] arr)
    {
        for(int i=1;i<arr.length;i++)
        {   
            int key=arr[i];
            int j=i-1;
            while (j >= 0 && arr[j] > key)
             { 
                 arr[j + 1] = arr[j]; 
                 j = j - 1; 
             } 
             arr[j + 1] = key; 
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
	public static void main(String[] args) {
	    int [] arr={12,32,1,44,13};
	    InsertionSort(arr);
	}
}
