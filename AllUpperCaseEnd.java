package JavaCoding;

	// Input: JagRatGUptA		Output: agatptJRGUA

public class AllUpperCaseEnd {
	
	public static void allUpperCaseEnd(String s)
	{
		String upper="";
		String lower="";
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				upper=upper+s.charAt(i);
			}
			else
			{
				lower=lower+s.charAt(i);
			}
		}
		System.out.println("Required String is:"+" "+upper+lower);
	}

	public static void main(String[] args) {

		allUpperCaseEnd("JagRatGUptA");

	}

}
