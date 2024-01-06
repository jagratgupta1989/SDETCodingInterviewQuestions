package JavaCoding;

public class Test {
	
	public static void testJ(String str)
	{
		int N=str.length();
		char[] ch=str.toCharArray();
		for(int i=0; i<=N-1; i++)
		{
			if(i%2!=0)
			{
				System.out.println(ch[i]);
			}
		}
	}	

	public static void main(String[] args) {
		
		testJ("nrupul");
		
	}

}
