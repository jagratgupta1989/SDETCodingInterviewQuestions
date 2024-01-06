package JavaCoding;

public class MoveAllUpperCaseToEnd {
	
	//Input: JaGraT		Output: araJGT
	public static void moveAllUpperCaseToEnd(String s)
	{
		int len=s.length();
		String upper="";
		String lower="";
		for(int i=0; i<len; i++)
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
		String finals=lower+upper;
		System.out.println(finals);
	}

	public static void main(String[] args) {

		moveAllUpperCaseToEnd("JaGraT");
	}

}
