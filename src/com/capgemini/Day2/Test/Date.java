package com.capgemini.Day2.Test;

public class Date {
	public static Object checkDate;

	public static String checkDate(int x,int y,int z) {
		String string="";
		int date=x;
		int month=y;
		int year=z;
		switch(month)
		{
		case 1: string="January";
		break;
		case 2: string="Febraury";
		break;
		case 3: string="March";
		break;
		case 4: string="April";
		break;
		case 5: string="May";
		break;
		case 6: string="June";
		break;
		case 7: string="July";
		break;
		case 8: string="Agust";
		break;
		case 9: string="September";
		break;
		case 10: string="October";
		break;
		case 11: string="November";
		break;
		case 12: string="December";
		break;
		default:System.out.println("wrong entered date"+string);
		}
		String converted=date+"/"+string+"/"+year;
		return converted;
		
		}
	}


