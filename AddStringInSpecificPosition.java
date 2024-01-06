package JavaCoding;

public class AddStringInSpecificPosition {
	
	public static void addStringAtStartingPosition(String s, String add)
	{
		String sd = add+s;
		System.out.println(sd);
	}
	
	public static void addStringAtEndingPosition(String s, String add)
	{
		String sd = s+add;
		System.out.println(sd);
	}
	
	public static String addStringAtSpecificPosition(String s, String add, int pos)
	{
		StringBuffer sb = new StringBuffer(s);
		sb.insert(pos, add);
		return sb.toString();
	}
	
	public static void addStringAtSpecificPosition1(String s, String add, int pos)
	{
		String sa = s.substring(0, pos)+add+s.substring(pos);
		System.out.println(sa);
	}
	
	public static void main(String[] args) {
		
		addStringAtSpecificPosition1("Jagrat","Gupta", 4);

	}

}
