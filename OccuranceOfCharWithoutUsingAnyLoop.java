package JavaCoding;

public class OccuranceOfCharWithoutUsingAnyLoop {
	
	//Input: Jagrat Gupta	Output: Occur of a - 3
	
	//1. olength = length();
	//2. aString = Replacing char with Space - replaceAll();
	//3. flength = length();
	//4. occur of char = olength-flength
	
	public static void occuranceOfCharWithoutUsingAnyLoop(String s, String c)
	{
		
		int olength = s.length();
		String str = s.replaceAll(c, "");
		int flength = str.length();
		System.out.println("Occur of"+" "+c+" "+"is"+":"+(olength-flength));
	}

	public static void main(String[] args) {

		occuranceOfCharWithoutUsingAnyLoop("Jagrat Gupta","f");

	}

}
