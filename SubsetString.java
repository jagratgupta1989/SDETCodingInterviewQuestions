package JavaCoding;

public class SubsetString {
	
	//Input: jar			Output: j ja jar a ar r
	
	public static void allSubsetString(String s)
	{
		int n=s.length();
		String [] arr = new String[(n*(n+1)/2)];
		int temp=0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				String p=s.substring(i,j+1);
				arr[temp]=p;
				temp++;
			}
		}
		
		System.out.println("All subsets of Strings are");
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		
		allSubsetString("The");
	}

}
