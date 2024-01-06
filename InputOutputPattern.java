package JavaCoding;

public class InputOutputPattern {
	
	//Input: 	4,1,8,5,1,3,1,9,7
	//Output: 	1,1,1,4,8,5,3,9,7
	
	public static void inputOutput(int arr[])
	{
		int len=arr.length;
		int temp[]=new int[len];
		int i;
		int j=0;
		for(i=0; i<len; i++)
		{
			if(arr[i]==1)
			{
				temp[j]=arr[i];
				j++;
			}
			else
			{
				continue;
			}
		}
		for(int k=0; k<len; k++)
		{
			if(arr[k]!=1)
			{
				temp[j]=arr[k];
				j++;
			}
		}
		for(int s=0; s<len; s++)
		{
			System.out.print(temp[s]+" ");
		}
	}

	public static void main(String[] args) {
		
		
		int arr[]= {4,1,8,5,1,3,1,9,7};
		inputOutput(arr);

	}

}
