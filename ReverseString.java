package net.exam.testpress;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(isRev("codecode"));
	}
	public static String isRev(String s)
	{
		char[] ch=s.toCharArray();
		int i=0,j=ch.length-1;
		
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}
}
