package JavaCoding;

public class RightArrayRotation {
	
	//Input: {1,2,3,4,5,6,7,8}, t=2, n=8
	//Output: {7,8,1,2,3,4,5,6}
			
	public static void rightArrayRotation(int arr[], int t, int n)
	{
		reverse(arr,0,n-1);
		reverse(arr,0,t-1);
		reverse(arr,t,n-1);
	}
	
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

		int arr[]= {1,2,3,4,5,6,7,8};
		rightArrayRotation(arr,3,8);
		printArray(arr);
	}
}
