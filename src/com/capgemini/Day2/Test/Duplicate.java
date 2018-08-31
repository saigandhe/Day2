package com.capgemini.Day2.Test;

public class Duplicate {

	public static String checkDuplicate(String input) {


		char ch;
		String output="";
		for(int i=0; i<input.length(); i++)
		{
			ch = input.charAt(i);
			
			if(ch!=' ')
			{
				
				output = output + ch;
				input=input.replace(ch, ' ');
				
			}
			
		}
		return output;
	}

}
