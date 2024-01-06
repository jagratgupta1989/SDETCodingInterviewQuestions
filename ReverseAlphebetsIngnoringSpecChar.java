package JavaCoding;

public class ReverseAlphebetsIngnoringSpecChar {
	
	public static String extractAlphabets(String s)
	 
	 // A*B^  --> B*A^
		
		{
		String sub="";
 		int len=s.length();
 		for(int i=0; i<len; i++)
 		{
 			if(Character.isAlphabetic(s.charAt(i)))
 			{
 				sub=sub+s.charAt(i);
 			}
 		}
 		return sub;
		 
		 }
	
 public static void reverseOriginal(String s)
 
 // A*B^  --> B*A^
	
	{
	 		char ch[]=s.toCharArray(); //ch={'A','*','B','^'}
	 		int len=s.length();
	 		String alp = extractAlphabets(s);
	 		StringBuffer sb=new StringBuffer(alp);
	 		String sbs = sb.reverse().toString(); //temp={'B', 'A'}
	 		System.out.println(sbs);
	 		char[] temp=sbs.toCharArray();
	 		int j=0;
	 		for(int i=0; i<len; i++)
	 		{
	 			if(Character.isAlphabetic(ch[i]))
	 			{
	 				ch[i]=temp[j];
	 				j++;
	 			}
	 		}
	 		for(int k=0; k<len; k++)
	 		{
	 			System.out.print(ch[k]);
	 		}
	 		
	 }
 
 public static void reverseOriginal1(String s)
 {
	 char[] ch = s.toCharArray();
	 int len=s.length();
	 int i=0;
	 int j=len-1;
	 while(i<j)
	 {
		 if(!Character.isAlphabetic(ch[i]))
		 {
			 i++;
		 }
		 if(!Character.isAlphabetic(ch[j]))
		 {
			 j--;
		 }
		 if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j]))
				 {
			 		char temp=ch[i];
			 		ch[i]=ch[j];
			 		ch[j]=temp;
			 		i++;
			 		j--;
				 }
	 }
	 for(int k=0; k<len; k++)
		{
			System.out.print(ch[k]);
		}
	 
 }
	

	
	
	public static void main(String args[])
	{
		reverseOriginal1("A*B^");
	}
	
			

	
}
