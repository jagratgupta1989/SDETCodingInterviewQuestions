package JavaCoding;

import java.util.Arrays;

public class Anagram {
	
	//Input: s1=abcd,	s2=cbad,	Output=s1 and s2 are anagram strings
	//Input: s1=abcd,	s2=cBaD,	Output=s1 and s2 are anagram strings
	//Input: s1=abcd,	s2=cbade,	Output=s1 and s2 are not anagram strings
	//Input: s1=abcd,	s2=bdae,	Output=s1 and s2 are not anagram strings
	
	public static void anagramCheck(String s1, String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		if(l1!=l2)
		{
			System.out.println(s1+" "+"and"+" "+s2+" "+"are not anagram strings");
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println(s1+" "+"and"+" "+s2+" "+"are anagram strings");
			}
			else
			{
				System.out.println(s1+" "+"and"+" "+s2+" "+"are not anagram strings");
			}
			
		}
	}

	public static void main(String[] args) {
		
		anagramCheck("abcd","bda1");

	}

}
