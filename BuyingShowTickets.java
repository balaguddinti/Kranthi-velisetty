package com.test.abstraction;

public class BuyingShowTickets {
	static long waitingTime(int[] tickets,int p){
		long seconds=0;
		while(tickets[p]!=0){
		for(int i=0;i<tickets.length;i++){
			if(tickets[p]==0){
				break;
			}else{
				if(tickets[i]==0){					
					continue;
				}else{
					tickets[i]=tickets[i]-1;
					seconds=seconds+1;
				}
			}
		}		
		}
		
		return seconds;
	}

	public static void main(String[] args) {		
		int tickets[]=new int[]{2,6,3,4,5};
		int p=2;
		if(tickets.length>=1 && (p>=0||p<tickets.length))
			System.out.println(waitingTime(tickets, p));

	}

}
