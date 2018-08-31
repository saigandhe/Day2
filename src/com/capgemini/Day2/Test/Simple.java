package com.capgemini.Day2.Test;

public class Simple {
	public static double findRateOfInterest(double principle,int time,int rate) {
		// TODO Auto-generated method stub
	double simple;
	double compound;
	simple=(principle * time * rate)/100;
    compound=principle * Math.pow(1.0+rate/100.0,time) - principle;
		return simple;
	}

	
}


