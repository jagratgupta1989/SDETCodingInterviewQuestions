package JavaCoding;

public class MoveAllZerosToEnd {
	
	//Input: 	{1,0,2,0,5,8,9,0,3,0,6}
	//Output:	{1,2,5,8,9,3,6,0,0,0,0}
	
	public static void moveAllZerosToEnd(int arr[])
	{
		int len=arr.length;
		int count=0;
		for(int i=0; i<len; i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		while(count<len)
		{
			arr[count++]=0;
		}
		for(int k=0; k<len; k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr[]={1,0,2,0,5,8,9,0,3,0,6};
		moveAllZerosToEnd(arr);

	}

}
