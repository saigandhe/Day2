package com.capgemini.Day2.Test;

public class IncomeTax {
	public static double findIncomeTax(int annualIncome) {
		// TODO Auto-generated method stub
		int tax=0;
		if(annualIncome>=0&&annualIncome<=180000) {
		return (0);
		}
		else if(annualIncome>=180001&&annualIncome<=300000) {
			 tax=(annualIncome*10)/100;
			return tax;}
			else if(annualIncome>=300001&&annualIncome<=500000) {
			 tax=(annualIncome*20)/100;
			return tax;}
		 if(annualIncome>=500000&&annualIncome<=1000000) {
			 tax=(annualIncome*30)/100;}
		return tax;
	}	

}
