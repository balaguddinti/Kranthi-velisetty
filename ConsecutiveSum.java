package com.test.abstraction;


public class ConsecutiveSum {
	static int consecutive(long num){
		int counter=0;
		int start=1;
		int end=(int)(num+1)/2;
		while(start<end){
			long sum=0;			
			for(int i=start;i<=end;i++){
				sum=sum+i;
				if(sum==num){
					counter+=1;
				}
				if(sum>num){
					break;
				}
			}
			start++;
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=15;
		long count=consecutive(num);
		System.out.println(count);

	}

}
