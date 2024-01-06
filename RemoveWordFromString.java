package JavaCoding;

public class RemoveWordFromString {
	
	// Input: Hello Jagrat This side 	Word: This		Output: Hello Jagrat side
	// Input: Hello World Hello			Word: Hello		Output: World
	
	//Approaches:
	//1. Using Inbuild method
	//2. Without inbuild method
	
	public static void removeWordFromString(String str, String word)
	{
		System.out.println(str.replaceAll(word, "").trim());
	}
	
	public static void removeWordFromString1(String str, String word)
	{
		String req="";
		String [] sb=str.split(" "); //sb={"Hello","Jagrat","This","Side"}
		for(int i=0;i<sb.length;i++)
		{
			if(!sb[i].equalsIgnoreCase(word))
			{
				req=req+sb[i]+" ";
			}
		}
		System.out.println("Required String is:"+" "+req.trim());
	}
	
	
	public static void main(String[] args) {
		
		removeWordFromString1("Hello World Hello","Hello");
		
	}

}
