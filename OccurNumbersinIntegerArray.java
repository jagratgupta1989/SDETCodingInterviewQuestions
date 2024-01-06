package JavaCoding;

import java.util.HashMap;
import java.util.Map;

public class OccurNumbersinIntegerArray {
	
	public static void occurNumbersinIntegerArray(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int c:arr)
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
		
		int[] arr= {2,3,6,4,3,4,7,9,5,2,1};
		occurNumbersinIntegerArray(arr);

	}

}
