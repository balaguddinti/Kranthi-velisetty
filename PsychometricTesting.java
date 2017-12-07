package com.test.abstraction;

import java.util.Arrays;

public class PsychometricTesting {
	static int[] jobOffers(int[] scores,int[] lowerLimits,int[] upperLimits){
		int[] rangeLimit=new int[lowerLimits.length];
		for(int i=0;i<lowerLimits.length;i++){
			int counter=0;
			for(int score:scores){
				if(score>=lowerLimits[i] && score<=upperLimits[i]){
					counter=counter+1;
				}
			}
			rangeLimit[i]=counter;
		}
		return rangeLimit;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores={20,34,56,56,76,76,23,54,67,12};
		int[] lowerLimits={12,34,65};
		int[] upperLimits={54,67,100};
		int[] range=jobOffers(scores, lowerLimits, upperLimits);		
		System.out.println(Arrays.toString(range));
		

	}

}
