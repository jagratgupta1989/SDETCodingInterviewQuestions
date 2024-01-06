package JavaCoding;

public class SwapElementsWithPosition {
	
	//Input: {8,2,1,4,3}		Output: {1,2,3,4,0,0,0,8}
	
	public static int findMaxElement(int arr[])
	{
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void swapElementsWithPosition(int arr[])
	{
		int max = findMaxElement(arr);
		int temp[]=new int[max];
		int j;
		for(int i=0; i<arr.length; i++)
		{
			j=arr[i]-1;
			temp[j]=arr[i];
		}
		
		for(int k=0; k<temp.length; k++)
		{
			System.out.print(temp[k]+" ");
		}
	}

	public static void main(String[] args) {

		int[] arr={8,2,1,4,3};
		swapElementsWithPosition(arr);
	}

}
