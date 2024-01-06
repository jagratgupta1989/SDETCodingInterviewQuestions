package JavaCoding;

public class PangramCheck {
	
	public static void checkPangram(String s)
	{
		String str = s.toLowerCase();
		boolean pan=true;
		for(char ch='a'; ch<'z'; ch++)
		{
			if(!str.contains(String.valueOf(ch)))
			{
				pan=false;
				break;
			}
		}
		if(pan==false) 
		{
			System.out.println("String is not pangram");
		}
		else
		{
			System.out.println("String is pangram String");
		}
	}

	public static void main(String[] args) {

		checkPangram("ABcdefghijklmnopqrtuVWXyz");

	}

}
