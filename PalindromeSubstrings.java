package JavaCoding;

public class PalindromeSubstrings {
	
	//Input: nitin			Output: n nitin i iti t i n
	//Input: 1001			Output: 1 1001 0 00 0 1
	
	public static boolean palindromeCheck(String s)
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
	
  public static void palindromeSubString(String s)
  {
	  s=s.toLowerCase();
	  int len=s.length();
	  for(int i=0; i<=len; i++)
	  {
		  for(int j=i+1; j<=len; j++)
		  {
			  String sub = s.substring(i, j);
			  if(palindromeCheck(sub))
			  {
				  System.out.print(sub+" ");
			  }
		  }
	  }
  }

	public static void main(String[] args) {

		palindromeSubString("1001");

	}

}
