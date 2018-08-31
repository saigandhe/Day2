package com.capgemini.Day2.Test;

public class Reverse {

	public static String checkReverse(String string) {
		
//		String ;
		String words[]=string.split(" ");
		String fnl="";
		for(int i=0;i<words.length;i++)
		{
			String rev="";
		for(int j=words[i].length()-1;j>=0;j--)
		{
			rev+=words[i].charAt(j);
		}
		
		fnl+=rev+" ";
		
	}	
return fnl;
}
}
