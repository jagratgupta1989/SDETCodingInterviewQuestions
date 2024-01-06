package JavaCoding;

public class ReverseString2 {
	
	//3. Input - Jagrat Gupta,	Output - targaJ atpuG
	
	public static String revserseOriginal(String s)
	{
		String rev="";
		int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		return rev;
	}
	
	public static void reverseStringInPlace(String s)
	{
		String rev="";
		String [] sb = s.split(" "); //sb={"Jagrat","Gupta"}
		for(int i=0; i<sb.length; i++)
		{
			String sb1 = revserseOriginal(sb[i]);
			rev=rev+sb1+" ";
		}
		System.out.println("Reversed String is:"+" "+rev.trim());
	}

	public static void main(String[] args) {

		reverseStringInPlace("Jagrat Gupta");

	}

}
