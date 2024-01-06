package JavaCoding;

import java.util.HashMap;
import java.util.Map;

public class OccurOfCharsUsingHashMap {
	
	//Input: Jagrat
	//Input: Jagrat Gupta
	
	public static void occurOfCharsUsingHashMap(String s)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		char[] ch = s.toLowerCase().toCharArray();
		for(char c:ch)
		{
			if(c==' ')
			{
				continue;
			}
			else if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		for(Map.Entry entry:map.entrySet())
		{
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		
		occurOfCharsUsingHashMap("Jagrat Gupta");

	}

}
