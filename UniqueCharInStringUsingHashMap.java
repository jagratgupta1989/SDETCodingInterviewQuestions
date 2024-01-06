package JavaCoding;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharInStringUsingHashMap {
	
	public static void uniqueCharInStringUsingHashMap(String s)
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
			if((int)entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		
		uniqueCharInStringUsingHashMap("Jagrat Gupta");

	}

}
