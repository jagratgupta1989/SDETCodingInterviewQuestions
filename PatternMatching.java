package JavaCoding;

public class PatternMatching {
	
	//Input: Jagratforjagrat Guptafor	Pattern: Jagrat
	//Input: Jagratforjagrat Guptafor	Pattern: taf
	//Input: Jagratforjagrat Guptafor	Pattern: tor
	//Input: Jagratforjagrat Guptafor	Pattern: dghfgdhrcgrg
	
	public static void patterMatching(String s, String pattern)
	{
		String [] sb = s.split(" ");
		int len=sb.length;
		int i;
		boolean flag=false;
		for(i=0; i<len; i++)
		{
			if((sb[i].equalsIgnoreCase(pattern)) || (sb[i].contains(pattern)))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Pattern is found at index:"+ i);
		}
		else
		{
			System.out.println("Pattern not found");
		}
	}

	public static void main(String[] args) {

		patterMatching("Jagratforjagrat Guptafor","dghfgdhrcgrg");

	}

}
