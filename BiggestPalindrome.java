package JavaCoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BiggestPalindrome {
	
	public static boolean checkPalindrome(String s)
    {
        for(int i=0; i<s.length()/2; i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
	
	public static void biggestPalindrome(String s)
    {
		s=s.toLowerCase();
        int len=1;
        List l=new ArrayList();
        String sub="";
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i; j<s.length(); j++)
            {
                    sub = s.substring(i, j+1);
                    if(checkPalindrome(sub)) {
                        int max = sub.length();
                        if(max>=len)
                        {
                            len=max;
                            if(len!=1)
                            l.add(sub);
                        }
                    }
            }
        }
        Iterator i=l.iterator();
        while (i.hasNext())
        {
            System.out.print(i.next());
        }
    }

	public static void main(String[] args) {

		biggestPalindrome("Wow nitin is driving racecar");

	}

}
