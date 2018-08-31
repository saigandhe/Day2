package com.capgemini.Day2.Test;

public class Multidimensional {
	public static boolean search(int[][] arrayInput,int key) {
		int flag=0;
		for(int i=0;i<arrayInput.length;i++)
		{
			for(int j=0;j<arrayInput[i].length;j++)
			{
			if(key==arrayInput[i][j])
				flag=1;
			}
		}
			if(flag==1)
				return true;
			else
				return false;
		}
	}



