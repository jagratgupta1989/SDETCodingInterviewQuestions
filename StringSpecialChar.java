package JavaCoding;

public class StringSpecialChar {
	
	//Input: Jagr@!at Gu>p#ta
	//Input: Jagrat Gupta
	
	public static void stringSpecialChar(String s)
	{
		int count=0;
		int i;
		char []ch = s.toCharArray();
		for(i=0; i<ch.length; i++)
		{
			int j = (int)(ch[i]);
			if(!(j>=48 && j<=57)&& !(j>=65 && j<=90)&& !(j>=97 && j<=122)&& !(j==32))
			{
				count++;
				System.out.println(ch[i]);
			}
		}
		if(count==0)
		{
			System.out.println("String has no special characters");
		}
		else
		{
			System.out.println("String has"+" "+count+" "+"special characters");
		}
	}
	
	public static void stringSpecialChar1(String s)
	{
		int count=0;
		int i;
		char []ch = s.toCharArray();
		for(i=0; i<ch.length; i++)
		{
			if(!(Character.isAlphabetic(ch[i]))&& !(Character.isDigit(ch[i]))&& !(Character.isWhitespace(ch[i])))
			{
				count++;
				System.out.println(ch[i]);
			}
		}
		if(count==0)
		{
			System.out.println("String has no special characters");
		}
		else
		{
			System.out.println("String has"+" "+count+" "+"special characters");
		}
	}
	
	

	public static void main(String[] args) {
		
		stringSpecialChar1("Jagr@!at Gu>p#ta");

	}

}
