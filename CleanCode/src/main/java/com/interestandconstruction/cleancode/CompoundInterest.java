package com.interestandconstruction.cleancode;

public class CompoundInterest {
	float principalAmount,rateOfInterest;
	int years;
	CompoundInterest(float principalAmount,int years,float rateOfInterest){
		this.principalAmount=principalAmount;
		this.rateOfInterest=rateOfInterest;
		this.years=years;
	}
	public float computeCompoundInterest() {
		float interest = principalAmount * (float)Math.pow((1 + rateOfInterest/100), years);
		return interest;
	}
}
