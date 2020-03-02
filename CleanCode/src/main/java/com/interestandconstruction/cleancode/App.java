package com.interestandconstruction.cleancode;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Map.Entry;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.debug("For House Construction enter 1\nFor Intrest calculation enter 2");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1) {
        	HashMap<String,Integer>housingStandards=new HashMap<String,Integer>();
        	housingStandards.put("Standard materials", 1200);
        	housingStandards.put("Above standard materials",1500);
        	housingStandards.put("High standard materials", 1800);
        	housingStandards.put("High standard material and fully automated home",2500);
        	for(Entry<String,Integer>map:housingStandards.entrySet()) {
        		LOGGER.debug("Type of house materials "+map.getKey()+" has a cost of "+map.getValue());
        	}
        	LOGGER.debug("Enter the amount corresponding to standard you want to construct");
        	int standardSelected=sc.nextInt();
        	LOGGER.debug("Enter number of yards in site");
        	int yards=sc.nextInt();
        	long totalCost=1l*yards*standardSelected;
        	LOGGER.debug("Total cost for construction of building is: "+totalCost);
        }
        else if(option==2) {
    		System.out.println("Enter principalamount");
    		float principalAmount = sc.nextFloat();
    		LOGGER.debug("Enter rateofinterset");
        	float  rateOfInterestPerYear = sc.nextFloat();
        	LOGGER.debug("Enter number of years");
        	int years = sc.nextInt();
        	LOGGER.debug("To calculate Simple Interest enter 1");
        	LOGGER.debug("To calculate Compound Interest enter 2");
            int interestOption= sc.nextInt();
            if(interestOption== 1) {        	
            	SimpleInterest SI = new SimpleInterest(principalAmount,years,rateOfInterestPerYear);
            	LOGGER.debug(SI.computeSimpleInterest());
            }
           else if(interestOption == 2) {
            	CompoundInterest CI = new CompoundInterest(principalAmount,years,rateOfInterestPerYear);
            	LOGGER.debug(CI.computeCompoundInterest());
            }
            else {
            	LOGGER.debug("Not a valid entry");
            }
        }
        else {
        	LOGGER.debug("Not a valid entry");
        }
     }
}
