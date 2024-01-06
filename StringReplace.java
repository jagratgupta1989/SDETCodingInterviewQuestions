package JavaCoding;

public class StringReplace {
	
	public static void replaceString(String s, char oldchar, char newchar)
	{
		System.out.println("String before replacement is:"+" "+s);
		s = s.replace(oldchar, newchar);
		System.out.println("String after replacement is:"+" "+s);
	}
	
	public static void replaceString1(String s, String olds, String news)
	{
		System.out.println("String before replacement is:"+" "+s);
		s = s.replace(olds, news);
		System.out.println("String after replacement is:"+" "+s);
	}
	
	public static void replaceAllString(String s, String regex, String news)
	{
		System.out.println("String before replacement is:"+" "+s);
		s = s.replaceAll(regex, news);
		System.out.println("String after replacement is:"+" "+s);
	}
	
	public static void replaceFirstString(String s, String regex, String news)
	{
		System.out.println("String before replacement is:"+" "+s);
		s = s.replaceFirst(regex, news);
		System.out.println("String after replacement is:"+" "+s);
	}
	

	public static void main(String[] args) {

		replaceFirstString("Jagrat Automation Jagrat Repository","Jagrat","JAR");

	}

}
