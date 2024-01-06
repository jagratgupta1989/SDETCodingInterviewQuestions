package JavaCoding;

public class RemoveNumberFromString {
	
	//Input: 12Jagrat3Gupta45		Output: JagratGupta
	
	//Approaches:
	//1. Using Inbuild method
	//2. Without inbuild method
	
	public static void removeNoFromString(String str)
	{
		System.out.println(str.replaceAll("\\d", ""));
	}
	
	public static void removeNoFromString1(String str)
	{
		String req="";
		char [] ch=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(!Character.isDigit(ch[i]))
			{
				req=req+ch[i];
			}
		}
		System.out.println("Required String is:"+" "+req);
		
	}
	
	public static void removeNoFromString2(String str)
	{
		String req="";
		for(int i=0; i<str.length(); i++)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				req=req+str.charAt(i);
			}
		}
		System.out.println("Required String is:"+" "+req);
		
	}

	public static void main(String[] args) {

		removeNoFromString2("12Jagrat3Gupta45");
	}

}
