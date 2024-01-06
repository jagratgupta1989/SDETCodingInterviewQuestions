package JavaCoding;

public class ReverseString1 {
	
	//2. Input - Jagrat Gupta,	Output - Gupta Jagrat
	
	public static void reverseStringWord(String s)
	{
		String [] sb = s.split(" "); //sb={"Jagrat", "Gupta"}
		String rev="";
		for(int i=sb.length-1; i>=0; i--)
		{
			rev=rev+sb[i]+" ";
		}
		System.out.println("Reversed String is:"+" "+rev.trim());
	}

	public static void main(String[] args) {

		reverseStringWord("Jagrat Gupta is Good");

	}

}
