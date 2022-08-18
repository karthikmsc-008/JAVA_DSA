/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
           int key=i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[key])
                {
                    key=j;
                }
            }
            int temp=arr[key];
            arr[key]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);    
        }
        
    }
	public static void main(String[] args) {
	    int [] array={21,3,12,43,1};
	    SelectionSort(array);
	}
}
