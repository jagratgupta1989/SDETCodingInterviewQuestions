package JavaCoding;

public class AddingCharToThousandSeperator {
	
	/*	Input: 1234			Output: 1.234
		Input: 123			Output: 123
		Input: 123456		Output: 123.456	*/
	
	public static String addingCharToThousandSeperator(int n, char c, int sep)
	{
		String s = String.valueOf(n);
		int len = s.length();
		int r=0;
		int count = 0;
		StringBuffer sb= new StringBuffer("");
		if(len>sep)
		{
			for(int i=len-1; i>=0; i--)
			{
				r=n%10;
				n=n/10;
				count++;
				if((count%sep==0)&&(i!=0))
				{
					sb.append(r);
					sb.append(c);
				}
				else
				{
					sb.append(r);
				}
			}
			sb.reverse();
		}
		else
		{
			sb.append(n);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		String sr = addingCharToThousandSeperator(123456, '.', 2);
		System.out.println(sr);
	}
}
