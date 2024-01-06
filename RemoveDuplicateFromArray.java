package JavaCoding;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	
	//Input: {10,20,20,30,30,40,50,50,60}	Output: {10,20,30,40,50,60}
	
	public static void removeDuplicateFromArray(int arr[], int n)
	{
		int temp[]=new int[n];
		int j=0;
		for(int i=0; i<n-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int k=0; k<j; k++)
		{
			System.out.print(temp[k]+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr[]={10,20,20,40,40,30,60,50,60};
		Arrays.sort(arr);
		removeDuplicateFromArray(arr,9);
	}

}
