package JavaCoding;

public class PrintAllUniqueWords {
	
	//Input: Welcome for jagrat for jagrat
	
	public static void printAllUniqueWords(String s)
	{
		String [] sb = s.split(" ");
		int len=sb.length;
		
		int i,j;
		for(i=0; i<len; i++)
		{
			int count=0;
			for(j=0; j<len; j++)
			{
				if(sb[i].equalsIgnoreCase(sb[j]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(sb[i]);
			}
			
		}
		
	}

	public static void main(String[] args) {

		printAllUniqueWords("Welcome for jagrat for jagrat");
	}

}
