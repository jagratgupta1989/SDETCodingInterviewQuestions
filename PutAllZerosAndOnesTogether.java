package JavaCoding;

public class PutAllZerosAndOnesTogether {
	
	//Input: 	{1,0,0,1,0,1,1,1,0,0,1}
	//Output:	{0,0,0,0,0,1,1,1,1,1,1}
	
	public static void putAllZerosAndOnesTogether(int arr[])
	{
		int len=arr.length;
		int count=0;
		int i;
		for(i=0; i<len; i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		for(i=0; i<count; i++)
		{
			arr[i]=0;
		}
		for(i=count; i<len; i++)
		{
			arr[i]=1;
		}
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {

		int arr[]={1,0,0,1,0,1,1,1,0,0,1};
		putAllZerosAndOnesTogether(arr);
	}

}
