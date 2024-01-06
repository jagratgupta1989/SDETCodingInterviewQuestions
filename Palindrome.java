package JavaCoding;

public class Palindrome {
	
	//Input: Nitin		Output: Given String is a palindrome string
	//Input: Nitine		Output: Given String is not a palindrome string
	//Input: Nitinn		Output: Given String is not a palindrome string
	//Input: N			Output: Given String is a palindrome string
	//Input: 1001		Output: Given String is a palindrome string
	//Input: 10011		Output: Given String is not a palindrome string
	
	public static void palindromeCheck(String s)
	{
		String rev="";
		int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Given String is a palindrome string");
		}
		else
		{
			System.out.println("Given String is not a palindrome string");
		}
	}
	
	public static void palindromeCheck1(String s)
	{
		s=s.toLowerCase();
		int i=0, j=s.length()-1;
		boolean b=true;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				b=false;
			}
			i++;
			j--;
		}
		if(b)
		{
			System.out.println("Given String is a palindrome string");
		}
		else
		{
			System.out.println("Given String is not a palindrome string");
		}
	}
	
	public static boolean palindromeCheck2(String s)
	{
		int len=s.length();
		for(int i=0; i<len/2; i++)
		{
			if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(len-i-1))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		boolean b = palindromeCheck2("10011");
		if(b)
		{
			System.out.println("Given String is a palindrome string");
		}
		else
		{
			System.out.println("Given String is not a palindrome string");
		}
		
	}

}
