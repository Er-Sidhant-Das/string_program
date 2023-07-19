package net.exam.testpress;

public class CheckPrime {
	public static void main(String[] args) {
		int num=3,count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)System.out.println("its a prime number");
		else System.out.println("not a prime number");
	}
}
