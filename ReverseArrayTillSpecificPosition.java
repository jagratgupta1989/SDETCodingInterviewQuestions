package JavaCoding;

public class ReverseArrayTillSpecificPosition {
	
	//Input: {1,2,3,4,5,6,7} Start - 0, End - 3		Output: {4,3,2,1,5,6,7}
	
	public static void reverse(int[] arr, int start, int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {

		int arr[]={1,2,3,4,5,6,7};
		reverse(arr,0,4);
		printArray(arr);
	}

}
