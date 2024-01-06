package JavaCoding;

public class SwapTwoStrings {
	
	//Input: s1 = Jagrat, s2 = Gupta				//Output: s1 = Gupta, s2 = Jagrat
	//Input: s1 = Jagrat Gupta, s2 = JAR HUB		//Output: s1 = JAR HUB, s2 = Jagrat Gupta
	
	public static void swapTwoStrings(String s1, String s2)
	{
		String temp;
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public static void swapTwoStrings1(String s1, String s2)
	{
		s1=s1+s2;		//1. s1 = JagratGupta s2 = Gupta
		s2=s1.substring(0, (s1.length()-s2.length())); //2. s2 = Jagrat , s1 = JagratGupta
		s1 = s1.substring(s2.length()); //3. s1 = length of 2nd substring
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {

		swapTwoStrings1("Jagrat Gupta","JAR HUB");

	}

}
