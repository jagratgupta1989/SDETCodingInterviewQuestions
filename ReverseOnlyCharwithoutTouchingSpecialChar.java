package JavaCoding;

public class ReverseOnlyCharwithoutTouchingSpecialChar {
	
	//Input: J@g!$t		Output: t@g!$J
	//Input: J@g!$tsf	Output: f@s!$tgJ
	
	public static void reverseOnlyCharwithoutTouchingSpecialChar(String s)
	{
		char[] ch = s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			if(!Character.isAlphabetic(ch[i]))
			{
				i++;
			}
			if(!Character.isAlphabetic(ch[j]))
			{
				j--;
			}
			if(Character.isAlphabetic(ch[i])&& Character.isAlphabetic(ch[j]))
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
		}
		String output=new String(ch);
		System.out.println(output);
	}

	public static void main(String[] args) {

		reverseOnlyCharwithoutTouchingSpecialChar("J@g!$tsf");
		
	}

}
