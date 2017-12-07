package com.test.abstraction;

public class FindTheWinner {
	static String winner(int[] andrea,int[] maria,String s){
		int andreaCount=0;
		int mariaCount=0;
		if(s.equalsIgnoreCase("even")){
			for(int i=0;i<andrea.length;i++){
				if(i%2==0){
					andreaCount=andreaCount+(andrea[i]-maria[i]);
					mariaCount=mariaCount+(maria[i]-andrea[i]);
				}
			}
		}else if(s.equalsIgnoreCase("odd")){
			for(int i=0;i<andrea.length;i++){
				if(i%2==1){
					andreaCount=andreaCount+(andrea[i]-maria[i]);
					mariaCount=mariaCount+(maria[i]-andrea[i]);
				}
			}
		}		
		if(andreaCount>mariaCount)
			return "andrea";
		else if(andreaCount<mariaCount)
			return "maria";
		else
			return "tie";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] andrea={1,2,3};
		int[] maria={2,1,3};
		String s="odd";
		System.out.println(winner(andrea, maria, s));
	}

}
