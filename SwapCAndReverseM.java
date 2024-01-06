package JavaCoding;

public class SwapCAndReverseM {
	
	//Input: Hello This is Jagrat		Output: Jagrat si sihT Hello
	//Input: Hello Jagrat				Output: Jagrat Hello
	
	public static String reverseString(String s)
	{
		String rev="";
		int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev.trim();
	}
	
	public static void swapCAndReverseM(String s)
	{
		String rev="";
		String [] sb = s.split(" "); //sb={"Hello","This","is","Jagrat"}
		for(int i=sb.length-1; i>=0; i--)
		{
			if(i==0 || i==sb.length-1)
			{
				rev=rev+sb[i]+" ";
			}
			else
			{
				rev=rev+reverseString(sb[i])+" ";
			}
		}
		
		System.out.println("Required String is:"+" "+rev.trim());
	}

	public static void main(String[] args) {

		swapCAndReverseM("Hello This is Jagrat");

	}

}
