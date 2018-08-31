package com.capgemini.Day2.Test;

public class ArraySearch {

	public static boolean searchElement(int[] inputArray, int keyElement) {
		int flag=0;
		for (int i=0;i<=inputArray.length;i++) {
			if(keyElement==inputArray[i])
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
				break;
			}
		}
			if(flag==1) 
			{
				return true;
			}
			else
			{
				return false;
			}
	
	}


}
