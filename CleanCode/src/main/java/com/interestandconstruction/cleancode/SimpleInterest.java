package com.interestandconstruction.cleancode;

public class SimpleInterest {
	float principalAmount,rateOfInterest;
	int years;
	SimpleInterest(float principalAmount,int years,float rateOfInterest){
		this.principalAmount=principalAmount;
		this.rateOfInterest=rateOfInterest;
		this.years=years;
	}
	public float computeSimpleInterest() {
		 float interest = (principalAmount * years * rateOfInterest);
		interest /= 100;
		return interest;
	}
}
