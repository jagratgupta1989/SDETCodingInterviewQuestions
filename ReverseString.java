package JavaCoding;

public class ReverseString {
	
	//1. Input - Jagrat Gupta,	Output - atpuG targaJ
	//2. Input - Jagrat Gupta,	Output - Gupta Jagrat
	//3. Input - Jagrat Gupta,	Output - targaJ atpuG
	
	//Approaches
	//1. Without inbuilt method
	//2. In built method - reverse()
	

	public static void reverseString1(String s)
	{
		String rev="";
		char [] ch = s.toCharArray();
		int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("Reversed String is:"+" "+rev);
	}
	
	public static void reverseString2(String s)
	{
		String rev="";
		int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reversed String is:"+" "+rev);
	}
	
	public static void reverseString3(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		String rev = sb.reverse().toString();
		System.out.println("Reversed String is:"+" "+rev);
	}
	
	public static void reverseString4(String s)
	{
		StringBuilder sb=new StringBuilder();
		System.out.println("Reversed String is:"+" "+sb.append(s).reverse());
	}
	
	public static void main(String[] args) {
		
		//reverseString1("Jagrat Gupta");
		//reverseString2("Jagrat Gupta");
		//reverseString3("Jagrat Gupta");
		reverseString4("Jagrat Gupta");
	}

}
