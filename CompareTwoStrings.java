package JavaCoding;

public class CompareTwoStrings {
	
	public static int compareTwoStrings(String s1, String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		int lmin = Math.min(l1, l2);
		for(int i=0; i<lmin; i++)
		{
			int s1ch = (int) s1.charAt(i);
			int s2ch = (int) s2.charAt(i);
			if(s1ch!=s2ch)
			{
				return s1ch-s2ch;
			}
		}
		if(l1!=l2)
		{
			return l1-l2;
		}
		else
		{
			return 0;
		}
	}
	
	public static boolean compareTwoStrings1(String s1, String s2)
	{
		if(s1.equals(s2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void compareTwoStrings2(String s1, String s2)
	{
		int f = s1.compareTo(s2);
		if(f==0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}


	public static void main(String[] args) {

		compareTwoStrings2("Jagrat","JagratG");

	}

}
