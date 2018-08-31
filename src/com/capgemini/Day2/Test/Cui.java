package com.capgemini.Day2.Test;

public class Cui {

	public static int checkId(String userid, String password, String id, String pass) {
	
		if(userid.equals(id)&&pass.equals(password))
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}

}
