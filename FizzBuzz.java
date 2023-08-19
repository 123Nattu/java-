package com.basic.pkg;

public class FizzBuzz {
	public static void main(String[] args) {
		int num=1;
		while(num<=50)	
		{
			if(num%3==0 && num%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if(num%5==0)
				{
					System.out.println("buzz");
				}
				else if(num%3==0)
					{
						System.out.println("fizz");
					}
					else
					{
						System.out.println(num);
					}
		num=num+1;
	}
}
}
