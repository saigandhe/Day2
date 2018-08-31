package com.capgemini.Day2.Test;

public class Palindrome {

	public static boolean checkPalindrome(int number) {
		// TODO Auto-generated method stub
		int result=0;
		int m;
		int remainder;
		while(number>0)
		{
			remainder = number%10;
			result = result*10+remainder;
			number  = number/10;
		}
		if(number==result) {
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
